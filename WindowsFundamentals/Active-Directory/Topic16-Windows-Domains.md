# Introduction

## What is a Windows domain?

Simply put, a Windows domain is a group of users, computers, and other resources that are centrally managed by an organization. Instead of each computer having completely separate user accounts and settings, the organization can manage many of these centrally.

Plus the organization can configure security policies directly from Active Directory and apply them to users and computers across the network as needed.

## Active Directory

Active Directory (AD) is Microsoft's directory and management system used to organize and manage resources within a Windows domain.

It contains information about objects within the domain, including:

- User accounts
- Computer accounts
- Groups
- Printers
- Other network resources

## Active Directory Domain Service

**Active Directory Domain Service (AD DS)** is the specific Windows Server service that provides the functionality of Active Directory within a domain.

AD DS maintains the directory containing information about domain objects and provides the infrastructure required for those objects to be managed as part of the domain.

## Domain Controller

A **Domain Controller (DC)** is a Windows Server computer running the AD DS role.

The Domain Controller provides access to the Active Directory's directory and is responsible for carrying out domain-related operations. An organization can have multiple Domain Controllers, allowing the directory to be replicated between them and providing and providing redundancy if one server becomes unavailable.

### Relationship between these services

The main idea is that:

- Windows domain: the centrally managed environment.
- Active Directory: the directory containing information about objects in that environment.
- AD DS: the Windows Server service that provides the Active Directory functionality.
- Domain Controller: the server running AD DS.

## Active Directory Objects

## Users

Users are one of the most common object types stored in Active Directory. A user object represents an identity within a Windows domain.

For example, an organization might have user accounts such as:

- Alice
- Bob
- Sarah

Each account represents an identity that Windows can use when determining who is accessing a system or resource.

### Security Principles

They are also one of the objects known as **security principals**, meaning that Windows can identify them when applying security permissions and deciding what the object is allowed to access or perform.

For example, a company might have a file called `Financial Reports.xlsx`. The organization could give a particular user permission to access that file. However, before this, Windows needs to identify the user account when deciding whether access should be allowed. 

Therefore, Users are considered security principles because they can be assigned **permissions and privileges** over resources such as:

- Files and folders
- Network shares
- Printers
- Applications
- Other network resources

Other Active Directory objects, such as **groups and computer accounts**, can also be security principles.

### Users Representing People

Most Active Directory user accounts represent people within an organization.

For example, an employee might be given an Active Directory account that they use to sign in to a company computer and access resources that they have been given permission to use.

The organization can control the user's access by assigning permissions directly to the account or by placing the user into groups.

### Users Representing Services

An Active Directory user does not always represent a human being. In fact, User accounts can also be created for **services and application**. These are commonly referred to as service accounts.

For example, a company might have a database service running on a server. Instead of allowing the service to run using a high privileged administrator account, the organization could create a separate account specifically for that service, called:

`MSSQL_Service`

The service can then run using this account and be given only the permissions it requires. In this case, it could be granted access to database files but no other unnecessary resources.

## Machines

Machines are another type of object stored within Active Directory.

When a computer joins a Windows domain, Active Directory creates a **computer account** for that computer. This allows the domain to recognize and manage the computer in the same way that it does user accounts.

### Machine Accounts

A computer account is also a **security principle**. This means that the computer has its own identity within the domain and can be recognized when Windows applies permissions and security controls.

It is important to note that the computer account is separate to the user account that people use to sign in.

### The $ at the End of a Machine Account

Computer accounts follow a standard naming convention. The account name is normally based on the computer's hostname followed by a **dollar sign ($)**.

For example:

- Computer name: DCO1
- Computer account: DC01$

The $ helps to distinguish a computer account from a normal user account.

### Machine Account Passwords

Computer accounts have their own passwords. Unlike a normal user password, the machine account password is normally **managed automatically by Windows**. Windows regularly changes the password rather than expecting a person to choose and maintain it.

This helps protect the credentials used by the computer when communicating with the domain.

The password is intended to be known and used by the computer itself rather than by an ordinary user.

### Why does a computer need an account?

A domain needs to know which computers are members of it. Therefore, the computer account provides an identity for the machine, allowing the domain to:

- Recognize the computer as a member of the domain.
- Apply security policies to the computer.
- Control access involving the computer.
- Allow the computer to communicate with other domain resources.

### Machine Accounts and Permissions

A computer account can have permissions within the domain because it is a security principle. However, this doesn't mean that the computer automatically has administrator privileges throughout the domain.

Its permissions depend on what access has been assigned to the computer account.

Plus, it is also important to distinguish between **Local administrator privileges and domain privileges**.

For example, a computer may have a local administrator account on its own operating system, but that doesn't mean the computer account is a Domain Administrator or that it has unrestricted access to other computers in the domain.

## Security Groups

Within Windows, we can define user groups that can assign access rights for files or other resources to entire groups rather than single users.

This improves account manageability as we can ass users to an existing group, and they will automatically inherit all the group's privileges.

Security groups are also considered security principles and can, therefore, have privileges over resources on the network.

Groups can have both users and machines as members. If needed, groups can include other groups as well.

### Different types of default Security Groups

Several groups are created by default in a domain, which can be used to grant specific privileges to users. Below are some of the most important groups within a domain:

| Security Group | Description |
|----------|--------|
|Domain Admins|Users of this group have administrative privileges over the entire domain. By default, they can perform administrative tasks on any computer within the domain, including the DCs.|
|Server Operators|Users in this group can administer Domain Controllers. They cannot change any administrative group memberships.|
|Backup Operators|Users in this group are allowed to access any file, ignoring their permissions. They are mainly used to perform backups of data on computers.|
| Account Operators | Users in this group can create or modify other accounts in the domain.|
| Domain Users | Includes all existing user accounts in the domain.|
| Domain Computers | Includes all existing computers in the domain. |
| Domain Controllers | Includes all existing DCs on the domain. |
 
[Complete list of default security groups](https://learn.microsoft.com/en-us/windows-server/identity/ad-ds/manage/understand-security-groups)

## Active Directory Users and Computers

To configure users, groups or computers within Active Directory, administrators can use **Active Directory Users and Computers (ADUC)**. ADUC can be run directly on a **Domain Controller** or installed on a Windows client using **Remote Server Administration Tools (RSAT)**, allowing Active Directory to be managed remotely.

On Windows, the console can also be launched with:

```cmd
dsa.msc
```

### Layout

Once Active Directory Users and Computers is open, we can then see the hierarchy of users, computers and groups that exist within the domain. Think of the ADUC as a folder structure, only instead of storing files, the folders contain Active Directory objects.

### The Domain Name

Starting at the top of the left side pane, we can see the **domain name**. For example, *example.local*. Underneath this will be the various **Organizational Units (OUs)**. These can be:

- Users
- Computers
- Sales
- IT
- Servers

An OU is essentially a container used to organize Active Directory objects. An example layout might look like:

### Sales

- Alice
- Bob
- Sales-PC01

### IT

- Sean
- Sarah
- IT-PC01

Here, the users and computers are **objects**, whilst **Sales** and **IT** are OUs containing these objects.

## Why have OUs?

OUs are simply for organization purposes, they are in-fact useful because we can apply **Group Policy** and other administrative settings to the objects within an OU. For example, the users and computers within the Sales OU, will possess Sales-specific policies.

Whereas, computers and users within the IT OU might have different restrictions that don't apply to Sales.

### Security Groups vs OUs

On one hand, OUs are handy for **applying policies** to users and computers, which include specific configurations that pertain to sets of users depending on their particular role in the enterprise.

On the other hand, Security Groups are used to **grant permissions over resources**. Common use cases include using groups to grant some users access to a shared folder or network printer.  

It is important to note that a user object can only exist in one OU/container at a time, whereas a user can be a member of many groups simultaneously. 

For example, the user Alice cannot have her user object located within both the Sales OU and IT OU. However, they could belong to multiple groups, such as:

- Sales Staff
- All Employees
- VPN Users

This is an important distinction between **OU placement and group membership**.

### Performing tasks within ADUC

By right-clicking the users within the OUs, we can perform simple tasks, such as:

- Creating
- Deleting
- Modifying
- Resetting the password

### Default Windows Containers

As well as the containers created by the organization, there are often containers which were created by Windows automatically, such as:

| Default Container | Description |
|----------|--------|
|Builtin|Contains default groups available to any Windows host.|
|Computer|Any machine joining the network will be placed here by default. Administrators can move them as needed.|
|Domain Controllers|Default OU that contains the DC in the network.|
|Users|Default users and groups that apply to a domain-wide context.|
| Managed Service Accounts |Holds accounts used by services in the Windows domain.|




