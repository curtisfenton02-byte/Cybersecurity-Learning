# Linux is a multi-user operating system

Linux was designed to allow multiple people to use the same computer safely, meaning that it needed to distinguish between its users and depending on the user, grant certain permissions for different files and actions.

A user account represents a person or an identity that interacts with the system. Each user is separated so that everyone has their own controlled environment. A user can have their own:

- username
- files
- settings
- permissions

Also, Linux has its own built-in users/accounts which are used by programs and services to help run the system. Some of these users/accounts are:

| user/account | Used by |
|-----------|-----------|
|  root  |           |
|  www-data | a web server might run as the www-data user   |
|  mysql  | a database server might run as the sql user  |
| ssh |  | 

As a result of having these programs and services being used by different users, the potential damage, of the overall system is limited if one of the programs/services is compromised.

---

## Files and Processes

Every file and process is associated with a user and Linux tracks who owns these files and can run programs.

## Owning a File

You can see who owns a file in Linux using the `ls -l` command. The displayed output will consist of the:

1. file permissions
2. owner
3. group

## File Permissions

Permissions often span ten spaces long and consist of `-` or a mixture of these three symbols: **d** **r** **w** **x**. Each symbol represents the owner's, group's and the other's permissions for the file.

### File Permission Anatomy

```bash
-rwxr-xr--
```

│
├── File type
│     -
│  
├── Owner permissions
│     rwx
│
├── Group permissions
│     r-x
│
└── Others permissions
      r--

The first symbol can be one of three characters:

| Character | Meaning |
|-----------|-----------|
| -  | regular file          |
| d  | directory          |
| l         | symbolic link          |

### Converting Symbolic Permissions to Numbers

Each permission has a numeric value:

| Permission | Value |
|----------|--------|
|  Read(r)  |  4      |
|  Write(w)  |   2     |
|  Execute(x)  |  1      |

By adding every group of three permission values together, we can figure out what permissions owner/group/others have for a file.

| Classes | Permissions | Calculation  | Value |
|-----------|-----------|-----------|-----------|
| Owner | rwx          | 4 + 2 + 1         |  7         |
| Group | r-x          | 4 + 1          |  5       |
| Others| r-x         |  4 + 1         |    5       |

As a result, **rwxr-xr-x** would equal the numeric value of **755** and it would read as: **the owner can do everything, others can read and execute**

### Why does a files' numerical value matter?

Understanding numeric permissions is important because:

- many linux commands use numeric values (e.g. chmod 755 file)
- they allow for quick identification of security risks
- knowing what the value means, allows professionals to control who can access sensitive files

So far I have used terminology such as 'Owner', 'Group' and 'Others' when referring to file permissions. I will now break down what each of these terms means on a fundamental level.

## File Ownership

When I say that a file has an owner, I do not mean ownership in the same way that someone would own a physical object. Instead, I am referring to how Linux records which user account created and/or currently owns a file.

Every file has a theoretical **label** which describes the: **owner**, **groups** and **others**. These three terms are known in Linux as the three classes of user categories (or classes of users) used to define permissions. 

Whenever someone tries to open, modify or delete that file, Linux first checks this **label** and considers these five things first:

1. Who is trying to access the file?
2. Who owns the file?
3. Is the person who is trying to access the file the owner?
4. If this person is not the owner, are they in the file's group?
5. If this person is not an owner, or in the file's permission, what permissions do **Others** have for this file?

Once Linux has considered these questions, will it then decide whether access is allowed. This is why every file must store:

- an owner
- a group
- permissions

In order to maintain file security.

## Changing File Permissions with chmod

I am now going to delve into why a file's owners, groups and others have such permissions as read, write and execute. Plus I will discuss the use of `chmod`, when changing these permissions.

### What Is chmod?

`chmod` stands for **change mode** and a mode represents the permissions associated with a file or directory. For example:

- -rw-r--r-- 1 | user1 user2 notes.txt

The permissions are -rw-r--r--, meaning that:

| Permission | User classes |
|----------|--------|
| rw-         | Owner       |
| r--         | Group       |
| r--         | Others       |

Currently with these permissions, the owner cannot execute the file. However, we can change that by using the `chmod` command.

### The Three Permission Categories

The three user classes (owner, group and others) are commonly represented by letters:

| Class | Letter |
|-----------|-----------|
|  user (owner)         |  u         |
|  group         |  g         |
|  others         |  o         |
| all | a |

- u: means the owner of the file.
- g: means users belonging to the file's group.
- o: means everyone else.
- a: means the owner + group + others.

These letters allow us to tell chmod whose permissions we want to change.

## Adding and Removing Permissions

`chmod` can be used to:

1. + add a permission
2. - remove a permission
3. = set permissions

### Example command:

```bash
chmod u+x script.sh
```
### Breakdown

| Section | Action |
|-------|-------------|
| chmod      | changes permissions            |
| u      | refers to the owner class           |
| +      | adds a permission            |
| x | refers to execute permission |

In full:

`chmod u+x script.sh` adds an execute permission for the owner of script.sh.

Now the previous permissions for the script.sh file has changed to:

```bash
 -rwr--r-- script.sh
```
As a result, the owner can now execute the file as well as read and write it. However, the other classes remain unchanged.

## Changing Group Permissions

Similar to adding permissions to the owner class, we can also add permissions, such as write, to the **group** class as well.

```bash
chmod g+w notes.txt
```
Now the file permissions will look something like:

- -rw-rw-r--

## Changing Other's Permissions

```bash
chmod o-r notes.txt
```
This command removes read permissions from others.

## Multiple Changes

We can make multiple permission changes in a single command by using a comma to separate the two. For example:

```bash
chmod u+x,g+w script.sh
```
Now:

- Owner can execute file.
- Group can write within the file.

## Numeric chmod

We have already established that permissions can also be represented numerically:

- r = 4
- w = 2
- x = 1

Therefore, the more popular way to change permissions is with numerics. For example:

### Written chmod

`chmod u+rwx,g+rx,o+rx file`

### Numeric chmod

`chmod 755 file`

The three numbers represent:

| Owner | Group | Others |
|---------|-------|----------|
|  7       | 5      |   5       |

Now if we calculate:

- 4 + 2 + 1 (rwx) = 7
- 4 + 1 (r-x) = 5 
- 4 + 1 (r-x) = 5

Final file permission layout for 755:

- `-rwx-r-x-r-x`

## chmod does not change a files Owner or Group

Whilst chmod does change a file's permissions, it does not change that files owner or group. To change who owns a file, we would use `chown`. 

## Permissions on Directories

The permission keywords: r, w and x don't mean the same thing when applied to a directory.

### File

- r = read the contents
- w = modify the contents
- x = execute the file

### Directory

- r = see/list the directory's contents
- w = create, delete or rename items inside it
- x = enter/traverse the directory

## Processes

A process is a program which is currently running on the machine. For example:

- Network Manager
- Bluetooth Service
- Desktop Environment
- Print Service
- SSH Server

Similar to files, all processes also have an **owner**. The owner of the process depends on who opened it. For example, if a user on the machine, opened the Firefox program, then they would be the owner of the Firefox process and this process will inherit the owner's permissions.

### Cybersecurity Relevance

The benefit to only allowing these processes the permissions of the person that opened them, is that if the process becomes compromised, it prevents that application from gaining unrestricted access to the system.

Let's take the Firefox example and look at what would happen if a malicious website managed to exploit Firefox. In this case, since Firefox is running as one of the accounts on the machine, the attacker could potentially, access that account's files, but they couldn't automatically modify critical operating system files because Firefox is not running as **root**.

This is why Linux runs many services under separate accounts to limit the damage to that account rather than the entire operating system.

## User Identity

When a user logs into Linux, they refer to themselves by their username. However, Linux doesn't identify users by their username and instead recognizes your User ID which is a unique identification number (UID) it has created for you.

This User ID is more important to Linux than a user's username and as a result, users can often times rename their account to a different name whilst their UID remains the same.

Linux will still know that all the files made by the previous username, belong to the new username with the same UID because ownership is linked to the UID rather than the displayed username.

Users can display their current UID using:

```bash
id
```
An example output could display:

`uid=1000(user) gid=1000(group) groups=1000(others),27(sudo)`

Above:

- `uid` is the user's UID.
- `gid` is the primary group ID.
- `groups` lists every group that the user belongs to.

## Why do Groups Exist?

Groups are collections of users who require the same permissions. Instead of assigning permission to every user individually, Linux assigns permissions to a group, making it much easier to manage access to files, directories, and system resources. This approach is scalable, easier to maintain, and forms the basis of permission management on most Linux systems.

Imagine everyone in an IT department needed access to `/company/scripts`, without groups, Linux would need to give permission to every employee individually. This would become tiresome and hard to manage, so instead users can be put into a group called 'developers', where everyone in that group automatically receives those permissions.

If a new developer joins the company, Linux doesn't need to change the folder permissions. Instead, the administrator can simply add the new employee to the 'developers' group.

Some groups, such as `sudo`, are created automatically by Linux and allow its members to temporarily perform administrative tasks.

### The key idea behind why Linux needs to have users and permissions

Linux needs to know:

- who everybody on its system is
- what files they're trying to access
- what permissions those files give a user

Similarly, when a program is involved, Linux needs to know:

- which user is running this program

### Overall Concept Diagram

USER
  |
  v
has a UID
  |
  v
belongs to GROUPS
  |
  v
runs PROCESSES
  |
  v
processes access FILES
  |
  v
files have an OWNER + GROUP
  |
  v
permissions determine what can be done
