# Managing Computers in Active Directory

## What happens when a computer joins a domain?

When a computer (such as a Windows 11 workstation) joins an Active Directory domain, it needs to have a corresponding **computer account** in Active Directory.

A computer account allows the domain to identify and manage that computer. To be clear, a computer account is not the same as a human user's account.

## Where is a Computer Account placed?

The default behavior of a domain is that a newly joined computer is placed into the built-in **Computers container**, provided no alternative destination has been configured.

## What about Domain Controllers?

Domain Controllers are treated differently to computers because they provide essential Active Directory services, including authentication and directory replication.

When a server is promoted to a domain controller, its computer account is placed into the **Domain Controller OU**, rather than the default Computers container.

This OU is significant because Group Policy settings and security configurations specific to domain controllers can be applied to it.

## Organizing Machines

Whilst there is no absolute rule for how machines should be organized within a domain, it is best practice to segregate devices according to their use. Typically, we would expect to see devices divided into at least three of the following categories:

| Device Category | Device Description |
|----------|--------|
|Workstations|These are one of the most common devices within an Active Directory domain. Each user within the domain will likely be logging into a workstation. These devices should never have a privileged user signed to them.|
|Servers|These are the second most common device within an AD domain. They provide services to users or others servers.|
|Domain Controllers|This device allows administrators to manage the AD Domain. Plus they are considered the most sensitive devices within the network as they contain hashed passwords for all user accounts within the environment.|

## Group Policies

As I have already mentioned, a benefit to separating these devices into their own individual OU's is so that administrators can apply different configurations and security baselines to users depending on their department.

Windows manages such policies through **Group Policy Objects (GPO)**. GPOs are simply a collection of settings that can be applied to OUs. They can contain policies aimed at either users or computers, allowing admins to set a baseline on specific machines and identities. 

For example, a policy aimed at users could be that they can't access the Control Panel. If this hypothetical policy is applied to Sophie's user account, the restriction applies when Sophie signs in, even if she uses a different domain-joined computer.

However, if we applied a policy to a computer specifically, then regardless of who logs into the machine, the policy still applies. 

## Group Policy Management Tool

To create GPOs, we first need to open the Group Policy Management tool from the Windows start menu, or via:

```cmd
gpmc.msc
```

The GPM interface will display a complete OU hierarchy, similar to that of the Active Directory User and Computers interface.

### Creating Group Policies

Now that we have launched the correct tool, we need to first expand the **Forest** (in the left-hand panel) to see our domains. Then we need to find the **Group Policy Objects** container and right-click it before selecting the **New** option. We will then be instructed to provide the GPO with a meaningful name, which should relate to the policy we are applying. For example, **Change minimum password length**.

Upon selecting 'Ok', we have now created the GPO, but it doesn't affect any users or computers yet. 

### Configuring Group Policies

First, we need to right-click the newly created GPO and select **Edit**. This opens the Group Policy Management Editor, which presents two distinct sections:

1. Computer Configuration - polices which apply to computers.
2. User Configuration - policies which apply to users.

Once we have decided whether the policy concerns a computer or a user, we will then have to navigate the settings/templates within these sections to find our desired policy:

- Software Settings
- Windows Settings
- Administrative Templates

Using our Password Length example, which is a computer policy, we would expand the **Windows Settings** subsection with Computer Configuration. Thus, presenting categories such as:

- Scripts
- Deployed Printers
- Security Settings
- Local Policies
- Event Log

Following along with our example, we would click the **Security Settings** and then the **Password Policy** option. The right-hand pane will then display the policies within that category.

We can then double-click the specific policy we want (or right-click and select properties), and a window will open, allowing us to either view a more detailed explanation of this policy setting in the **Explain** tab or change the policy parameters. For example, if we want to change the minimum password length to 10 characters long.

Plus, there may be an option to turn the policy on, depending on the exact setting/template. Here we should see these three options:

- Not Configured
- Enabled - Turn on
- Disabled

We need to select Enabled and then click apply/OK.

### Linking a Group Policy Object

Now that we have created/configured the policy, the final step is to now link with the Organizational Units corresponding to the users who we want to apply the rule to.

To do this, we can right-click the OU and then select **Link an existing GPO**.

If we intend on applying a policy to all OUs within the domain, we can link the Group Policy Object to the domain instead, and it will automatically apply to all users/workstations, servers and domain controllers.

## Examining a Policy

Back within the Group Policy Management tool, we can examine a Group Policy Object by clicking it and then the first tab on the right-hand pane will be the **Scope** tab. 

### Scope 

The first section of the Scope tab describes where the GPO is linked in the AD.

Then the second (middle) section is labeled Security Filtering as this is where we can apply settings to specific users, groups and/or computers under the selected OU. By default, the settings will apply to the Authenticated Users group, which includes all users/PCs.

### Settings

The Settings tab contains the actual contents of the GPO and informs us on what specific configurations it applies.

To view these configurations in more detail, we can click the **show** link on the right.

## SYSVOL and Group Policy Distribution

SYSVOL is a special, shared folder that exists on each Domain Controller (DC) in an Active Directory domain. It is used to store and make certain domain-wide files available to domain users and computers. One of its most important purposes is storing the file-based part of Group Policy Objects (GPOs).

A GPO actually consists of two main components:

1. Group Policy Container (GPC) - stored in AD. This contains information about the GPO, such as its configuration and how it is linked within the domain.
2. Group Policy Template (GPT) - stored in SYSVOL. This contains the files and policy information associated with the GPO.

Therefore, a GPO is not stored entirely in SYSVOL or entirely in AD. Both components are required for Group Policy to function correctly.

### The SYSVOL Share

On a DC, the SYSVOL data is stored locally under:

`C:\Windows\SYSVOL\sysvol\`

However, domain computers do not normally access this using the DC's local `C:\` path. Instead, they access SYSVOL through a **network share**.

For example:

`\\example.com\SYSVOL`

Or:

`\\DC01\SYSVOL`

The network share makes the relevant SYSVOL files available to computers across the domain.

Within SYSVOL, GPO policy files are stored under the **Policies** directory. Each GPO has its own folder, identified by the GPO's unique GUID.

### How a Computer Receives a GPO

When a domain-joined computer starts up or a user logs in, Windows determines which GPOs apply to that computer or user.

It uses information from Active Directory to determine which GPOs are relevant. It then accesses the corresponding policy files in SYSVOL.

### Group Policy Refresh

Group Policy is not normally checked continuously. Windows periodically refreshes GP in the background.

For typical domain-joined client computers, the background refresh interval is approximately 90 minutes, with a random offset of up to 30 minutes. This means that a policy change can normally take up to around 120 minutes (2 hours) to be processed by a client.

GP is also processed during events such as computer startup and user sign-in.

Therefore, if an administrator changes a GPO, the affected computer may not apply the change immediately.

### Forcing Group Policy Refresh

Instead of waiting for the normal refresh interval, an administrator can manually trigger a GP refresh on a computer with:

```PowerShell
gpupdate /force
```

The `/force` option causes Windows to reapply all applicable policy settings rather than only settings that have been changed.

Some policy changes may require the user to log off, or the computer to restart, before the change can fully take effect.

