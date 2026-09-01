# How Linux Checks Permissions

Linux uses these various pieces of information to determine if someone is allowed to perform a certain action based on its permission system:

- Users
- UIDs
- Groups
- Files
- Directories
- Owners
- Permissions
- chmod
- chown

I will now create an example scenario and then breakdown how Linux handles a certain action initiated by someone with these credentials.

## The Scenario

The example information for the file, directory and people I will use are:

1. UID - 1000
2. Groups - developers
3. Others - Bob
4. File - notes.txt
5. Directories - /home/user1
6. Owners - user1
7. Permissions - different for each user, file and directory

## Step 1: Linux Identifies Us

In this scenario, we are logged into Linux as **user1**. We are attempting to read the contents of a file called notes.txt. Our account UID is **1000** which informs Linux that the process running our command belongs to UID 1000.

The command:

```bash
cat /home/user1/notes.txt
```
Linux interprets this as *a process running as UID 1000 is trying to access this file*.

## Step 2: Linux Determines What We're Trying to Access

Based off of our command:

```bash
cat /home/user1/notes.txt
```
Linux needs to find:

/
└── home/
    └── user1/
        └── notes.txt

This is because Linux doesn't immediately access files like notes.txt. It instead uses the path to travel through the directory structure leading to the file. Hence, why the directory execute (x) permission is crucial as it allows Linux to traverse through multiple directories to reach the final file.

## Step 3: Linux Checks the Directory Permissions

The directory is `/home/user1/` and its permissions are `drwx------`. This means that the owner has `rwx` whilst the group and others have no permissions.

If user1 owns the directory, then Linux applies the **owner permissions* to user1. Therefore, user1's permissions are now `rwx`. As a result, user1 has the execute (x) permission meaning that they can traverse the directory.

However, imagine if Alice, who is neither the owner nor apart of a group that has the appropriate permissions, tries to access `/home/curtis/notes.txt`, she will fall into the `---` section of the directories permissions. Thus, she cannot traverse the directory, even if notes.txt itself had `-rw-r--r--` because she can't get through the directory containing it. 

## Step 4: Linux Determines Which Permission Set Applies

Assuming that Linux reaches `notes.txt`, sees that its permissions are `-rw-r-----` and that the ownership of the file is:

- Owner: user1
- Group: developers

Linux now needs to decide which of the three permission sections applies to the current user.

1. Is the user the owner?
2. Is the user a member of the file's group?
3. If neither of the above is true, use Others permissions.

In this case:

- User1 is the owner, so Linux uses `rw-`.
- Alice isn't the owner but belongs to the developers group, so Linux uses `r--`.
- Bob isn't the owner nor apart of the developers group, so Linux uses `---`.

This demonstrated why the three permission sections exist to allow Linux to provide different levels of access to various users. 

## Step 5: Linux Checks the Requested Action

So far, Linux knows:

1. Who we are.
2. Which object we're accessing.
3. Which permission category applies.

However, it still needs to know what we're trying to do, which in this case is to read a file with `cat notes.txt`.

Other possible actions could include:

```bash
nano notes.txt
```
This would require the ability to **write** to the file.

Plus:

```bash
./script.sh
```

This requires **execute** permission on the file and the ability to traverse its containing directories. 

Basically, Linux is trying to figure out whether the user is wanting to read, write and/or execute. Then checking whether the directory/file allows it. 

## Overall Permission Decision Structure

Linux's permission decision is a chain of checks which identifies the user; follows the path through the necessary directories; determines whether the user is the owner or a member of the file's group; applies the corresponding permissions and finally checks whether those permissions allow the requested action. 

This is the process behind a **Permission denied** error.

## Useful Commands for Inspecting Our Permissions

```bash
whoami
```

Shows our current username.

```bash
id
```

Shows our UID, GID and groups.

```bash
ls -l
```

Shows information about files including:

- permissions
- owner
- group

```bash
ls -ld directory
```

This shows the permissions of the directory itself rather than listing everything inside it.

```bash
namei -l
```

Another useful command for, particularly for cybersecurity, as it allows us to inspect the permissions of the different directories making up a path.

An example structure would be `namei -l /home/user1/projects/report.txt`

### Summary

The above commands allow us to inspect the information Linux uses when making permission decisions. These commands are particularly useful when troubleshooting Permission denied errors and later when investigating permissions during cybersecurity exercises.














