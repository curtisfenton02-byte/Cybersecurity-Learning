# Managing Users in Active Directory

This section I will work through TryHackMe's example scenario for managing users within the Active Directory.

## Deleting extra Organizational Units and users

Within the Active Directory Users and Computers application, administrators can right-click any unnecessary OUs and then select **delete** to begin the removal process.

This will not immediately delete the OU yet because by default, OUs are protected against accidental deletion. Hence, why we might receive an error message, claiming that we *don't have the sufficient privileges to delete this OU*, after we confirm the deletion.

### How to complete the deletion process

If we receive the *insufficient privileges* message, then we will have to enable the **Advanced Features** in the View menu, located at the top of the Window.

Upon enabling Advanced Features, ADUC will present some additional containers but more importantly, all us to disable the accidental deletion protection. To do so, we need to again right-click the same OU and select **Properties**.

Once we're within the Properties tab, we need to select **Object** and then uncheck the *Protect object from accidental deletion* box.

Now when we attempt to delete the OU again, we will only be prompted to confirm the deletion and as a result, removing any users, groups or OUs within this OU.

## Delegation

Delegation of control in Active Directory allows administrators to grant specific users or groups the permission to perform particular administrative tasks over objects within an Organizational Unit.

This allows organizations to distribute administrative responsibilities without granting users highly privileged roles such as **Domain Administrator**.

For example, within the TryHackMe scenario, we want to grant the user in charge of IT support the privilege to reset other low-privilege users' passwords. Which in this case would mean specifically control over the Sales, Marketing and Management OUs.

### How to delegate control over an OU

To delegate control over the Sales OU to a user within the IT OU (Phillip), we will need to right-click Sales and select **Delegate Control**.

This will open a window where we will be first asked for the users to whom we want to delegate control to (Philip).

To avoid mistyping the user's name, we can type *phillip* and then click the **Check Names** button to utilize Window's autocomplete function.

Afterward, click OK and then Next to proceed onto the following steps.

Now we should be within the **Tasks to Delegate** section of this process. Here, we can select from a list of common tasks or customize our own to give to Phillip.

In this case, we will select the *Reset user passwords and force password change at next login* option and then click to proceed onto the final step, which is finalizing the whole process.

Phillip will now have the ability to reset passwords for any of the users within the Sales department. I will now test this out by attempting to reset Sophie's (Sales user) password.

## Logging into Phillip's machine via Remote Desktop Protocol (RDP)

To log into Phillip's machine via RDP, we will need to open the Run prompt (Win + R) and then enter:

```cmd
mstsc
```

Next, in the **Computer** section, enter the computer's IP address (in this case TryHackMe's machine IP).

If RDP connection is using saved credentials and attempting to log in as **Administrator**, click **Show Options** and then change the username to that of the account we intend on connecting to (Phillip). Then enter the account password and click connect.

## Resetting Sophie's Password as Phillip

### Using ADUC

Once we are logged into Phillip's machine, we then need to change Sophie's password via the ADUC, assuming that phillip has the privilege to access this interface:

1. Open the ADUC (dsa.msc). 
2. Find Sophie in the left-hand tree of the ADUC interface.
3. Right-click Sophie's user account and look for **Reset Password**.
4. Select this option and then enter a new password. 

If we want Sophie to create a new password upon next logon, we need to tick the **User must change password at next logon** option within the same Reset Password window.

### Using PowerShell

Due to Phillip not having sufficient privileges to open Active Directory Users and Computers, we'll instead have to rely on other methods to reset passwords.

The method TryHackMe suggests is using PowerShell, so:

```PowerShell
Set-ADAccountPassword sophie -Reset -NewPassword (Read-Host -AsSecureString -Prompt 'New Password') -Verbose
```

## What the command is doing

This command, provided by TryHackMe, is combining several features together into one line. Essentially, it is resetting Sophie's Active Directory password and asking us to enter the new password securely. Plus it requests an informative breakdown about what PowerShell is doing.

### PowerShell Breakdown

Since the above command consists of multiple features, I will break them down to improve the overall clarity.

```PowerShell
Set-ADAccountPassword
```

This is the PowerShell command (cmdlet) used to change or reset the password of an Active Directory account.

Microsoft provides this cmdlet as part of the **Active Directory PowerShell module**.

### Sophie

```PowerShell
Set-ADAccountPassword sophie
```

By adding the AD user account name `sophie`, we are declaring whose password it is that we want to change.

### Reset

```PowerShell
-Reset
```

This next part of the command, tells PS that we want to reset the password, rather than change it by supplying Sophie's existing password.

```PowerShell
-NewPassword
```

This tells `Set-ADAccountPassword` that the password we supply to the **New Password** prompt should be assigned to the account.

However, this command alone doesn't simply place the password we enter directly into the `-NewPassword` command. Instead, it uses:

```PowerShell
(Read-Host -AsSecureString -Prompt 'New Password')
```

Overall, this means:

1. Ask me for a password.
2. Hide what I type.
3. Return it in the secure format expected by the cmdlet (Set-ADAccountPassword).

### Read-Host

```PowerShell
Read-Host
```

This asks us to type something into PowerShell. For example, whatever we enter into 'New Password:' is then returned to the command.

### -Prompt 'New Password'

```PowerShell
-Prompt 'New Password'
```

This simply controls the text that PS displays. Hence, why we see New Password.

### -AsSecureString

```PowerShell
-AsSecureString
```

This tells `Read-Host` to treat our input as a **SecureString** (*****) rather than ordinary visible text.

### Why is Read-Host... in Parenthesis?

By having:

```PowerShell
-NewPassword (Read-Host ...)
```

The parenthesis tell PS to run the command within them first, and then give the result to `-NewPassword`.

### -Verbose

```PowerShell
-Verbose
```

This part of the command tells PS to provide additional information about what it is doing. Therefore, it isn't required to reset the password but can be helpful.

The Verbose response message:

```PowerShell
VERBOSE: Performing the operation "Set-ADAccountPassword" on target
"CN=Sophie,OU=Sales,OU=THM,DC=thm,DC=local".
```

### What does the verbose message mean?

```PowerShell
CN=Sophie,OU=Sales,OU=THM,DC=thm,DC=local
```

This is Sophie's **Distinguished Name (DN)**, which provides the complete location of her object within the Active Directory:

| Syntax | Meaning |
|--------|---------|
|CN=Sophie|This is the Common Name of the object (Sophie)|
|OU=Sales|Location of the object: Sophie is located within the Sales OU.|
|OU=THM|The Sales OU is located inside another OU/container called THM.|
| DC=thm and DC=local | These identify the domain as `thm.local`.|

### Full visual representation of Sophie's Location

thm.local
   │
   └── THM
        │
        └── Sales
             │
             └── Sophie

## Password Conditions

Now that we entered the prompt to reset Sophie's password, we need to create a suitable replacement password. In the case of TryHackMe's Active Directory Domain, the user account passwords need to meet certain requirements. 

To view the domain's password policy, we can enter:

```PowerShell
Get-ADDefaultDomainPasswordPolicy
```

This will show us such things as:

- MinPasswordLength
- PasswordHistoryCount
- ComplexityEnabled
- MaxPasswordAge
- MinPasswordAge

## Enforcing a new password reset at next logon

Since we wouldn't want Sophie to keep on using a password we know, for security reasons, we can also enforce a password reset at the next logon with the following command:

```PowerShell
Set-ADUser -ChangePasswordAtLogon $true -Identity sophie -Verbose
```

### Set-ADUser

```PowerShell
Set-ADUser
```

This is a PS cmdlet used to modify the properties of an Active Directory user account.

### ChangePasswordAtLogon $true

```PowerShell
-ChangePasswordAtLogon $true
```

This tells Active Directory that it requires this user to change their password next time they log on.

`$true` specifically meaning to enable the setting that is `Logon`.

`$false` would turn the setting off.

## Overall Function

So ultimately, by utilizing the two commands, we have reset Sophie's password and then forced her to change it when she next logs in.

