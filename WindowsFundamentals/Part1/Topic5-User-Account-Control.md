# User Account Control

A user doesn't require elevated privileges on their computer system to run simple tasks like internet browsing or working with Word. This is necessary because if every user had administrative privileges, then this would increase the risk of system corruption from malicious malware infection. 

Most users are logged into their own Windows machines as local administrators, meaning that their user account can influence the system, making it a prime target for hackers.

## How Microsoft Protects Local User Privileges

To protect a user with such influential privileges, Microsoft introduced User Account Control (UAC) back with the introduction of Windows Vista and has kept this feature throughout the subsequent versions of Windows which followed.  

## How does UAC work?

Windows uses UAC to separate our normal activity from actions that need elevated privileges. Therefore, when a user, with an administrator account type, logs into a system, Windows doesn't automatically provide every application we open with full administrative privileges.

Instead, our normal programs (Chrome, PowerShell, Notepad, etc) run with a standard, non-elevated security token. This is called **Admin Approval Mode**.

### Remote Desktop Connection

```powershell
mstsc
```

This command allows us to connect with another Windows computer over a network and use its desktop as though we were sitting in front of it ourselves.

To gain access to a user account on a remote desktop, we will need to know the:

- Device's IP address
- Account's username
- Account's password

### Performing Administrative Actions

When an operation requiring higher-level privileges needs to execute, the user will be prompted with the familiar UAC prompt, *Do you want to allow this app to make changes to this device*, to confirm if they permit the operation to run.

A clear visual representation for if UAC will prompt us to allow higher-privilege before it can install a program is a program which has a shield icon. This icon generally means that running this action may require administrative privileges. 

Opening everyday programs will not prompt this shield. However, if we try to:

- Install a program
- Change certain system settings
- Run an administrative management tool

These are more likely to have the shield.

Administrative accounts already have the ability to elevate tasks, so when prompted by UAC, we are being asked to approve this elevation.

Although, if we were a standard user, we generally cannot elevate without inputting the credentials (username/password) for an account which does have administrative privileges.

Ultimately UAC reduces the likelihood of malware successfully compromising our system.

