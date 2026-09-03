# How permissions work based on the specific object

The meaning of each permission (read, write and execute) depends on what type of object we're trying to access.

The two important cases are:

1. Regular file
2. Directory

## Permissions on Regular Files

A regular file, is that which contains data such as:

- .txt
- .sh
- .jpg

The permission determines what we can do with that file's contents.

### Read (r)

Read permission allows the user to **read** the contents of the file. For example:

```bash
cat notes.txt
```
If the user/group/others have the **read** permission, then Linux will accept the request to retrieve notes.txt's contents.

### Write (w)

The **write** permission allows users to modify the contents of a file. For example, we could amend the contents of the notes.txt file to contain:

- Hello Linux

### Execute (x)

The **execute** permission allows the file to be executed as a program. This becomes extremely useful for files which contain programs or scripts. For example:

```bash
./script.sh
```
Ordinary data files such as text files usually don't need execute permission, whilst executable programs and scripts often do.

## Permissions on Directories

A directory isn't a normal file containing ordinary user data but rather a container which is used to organize and reference files and other directories. Hence, why:

- /home/user1

Can also contain:

- documents/
- downloads/
- pictures/
- notes.txt

Due to directories behaving differently to regular files, r, w, and x permissions have different meanings when applied to them.

For directories:

|Permission|Action|
|----|------|
|r|list|
|w|modify entries|
|r|enter/traverse|

### Directory Read (r)

The read permission for a directory all users to see the names of the items inside the directory. As a result, the list command would be allowed to execute on files which the owner has been granted the read permission on.

```bash
ls documents
```
However, just because the user can read the names within the directory, doesn't mean that they can open these items. They may still be denied access to the file itself because of the file's own restrictive permissions.

### Directory Write (w)

By granting the **write** permission to a directory, we are allowing those users to modify its contents or entries. This includes actions such as:

- creating files
- creating directories
- deleting files
- renaming entries

We can potentially, delete a file within the directory even if we don't have the **write** permission for it. This is because the deletion of a file is primarily controlled by the permissions on the directory containing it. 

### Directory Execute (x)

For a directory, **execute** allows the user to enter or traverse the directory. This definition is the parallel to 'directory read' as it not only allows the user to look through the items within the directory, but also access them.

## Read and Execute are often needed together

On one hand, if a user only had the read permission for a directory, then they could only list its contents but not access them. 

On the other hand, if the user only had the execute permission, they could traverse the directory but are unable to list its contents. This might be irrelevant if the user is already aware of the contents and can then, provided that the file allows them to read it, navigate the files. 

Otherwise, if the user had both read and execute permissions, they could both list and traverse the contents of a directory.

## Directory Permission Example

`drwxr-xr--`

Breakdown:

- d: directory
- rwx: oner
- r-x: group
- r--: others

### Owner

- r: they can list contents
- w: they can create/delete/rename entries
- x: they can enter/traverse content

### Group

- r: they can list contents
- : no **w** means that they cannot modify entries 
- x: they can enter/traverse

### Others
- r: they can list contents
- : no **w** means that they cannot modify entries 
- : no **x** means that they cannot enter/traverse content
