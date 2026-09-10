# User Accounts, Profiles and Permissions

User accounts, on a typical Windows system, will always be either an Administrator or a Standard User.

Depending on the type of account, the user will be able to perform certain actions on that specific Windows system. These actions are:

|Type of Account|Performable Actions|
|----|----|
|Administrator|Can add/delete users, modify groups and system settings.|
|Standard User|Can only make changes to folders/files attributed to the user but cannot perform system-level changes like program installation.|

## Administrative Access

Assuming we are currently logged in as an Administrator, there are several ways to determine which user accounts exist on the system.

In Windows 11 open:

- Settings + Accounts + Other users

Then under **Add other user**, select **Add account**.

Windows will then ask for the new user's sign-in information. We now have the option to either add a Microsoft account, or select *I don't have this person's sign-in information* and instead choose to add a user without a Microsoft account. Thus creating a local account.

After the account has been created, the account can then be managed from Settings + Accounts + Other users. We, as the administrator, will the option to *change account type* or *remove* the account all together. 

Each user profile folder will fall under `C:\Users`. For example, the profile folder for Max's user account will be located at C:\Users\Max.

## Local User and Group Management

By clicking the Windows key + R or right-clicking the Windows icon in the taskbar then selecting the **Run** option. This opens the Run Dialog Box where we can then enter `lusrmgr.msc`.

As a result, this opens the Local Users and Groups window, which is a Microsoft Management Console (MMC) snap-in used to manage local user accounts and groups on a Windows system.

This console contains two main sections:

- Users
- Groups

### Users

The Users section lists the local accounts that exist on the machine. Similar to how we were able to manage a new user account earlier, by right-clicking one of these users, we are provided with management options such as:

- Set password
- Properties
- Delete

Being an administrator, we can also create a new local account from **Action** and then selecting the **New User** option. Alternatively, we can right-click an empty space within the Users pane and then select New User.

### Cybersecurity Relevance

The **Properties** window is particularly useful for cybersecurity because it exposes account information which isn't as obvious in the normal Settings interface.

For example, we can see whether an account is:

- Enabled or disabled
- A member of a particular group
- Configured with password-related restrictions

### Groups

The Groups section contains the local security groups on the computer.

Groups are important because Windows uses group membership to assign permissions and privileges to users. For example, if user1 was a member of the Administrators group, then they would be classified as an administrator and hence receive the relevant permissions. A user can be assigned to multiple groups.

We can double-click a group to open its own Properties window which contains the group's name, description and members.

## What if we can't open the Local Users Groups Windows?

We may receive an error indicating that Windows cannot find the `lusrmgr.msc` command. This is usually because the Local Users and Groups MMC interface isn't included in this Windows edition.

However, we can still list the system's local users and groups by using commands such as:

### Get local users

```cmd
net user
```

### Get local groups

```cmd
net localgroup
```

