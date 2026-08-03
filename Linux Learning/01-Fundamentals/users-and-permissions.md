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

You can see who owns a file in Linux using the `ls -1` command. The displayed output will consist of the:

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

| Group | Permissions | Calculation  | Value |
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


