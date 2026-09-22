# Introduction to Command Line

## Shell Environment

Here is an example shell:

**student@lab-vm:~$_**

### Section Breakdown

| Section | Name | Description |
|------|-------------|-------|
|student|Username|This indicates the username of the current user.|
|lab|Hostname|This indicates the name of the system currently logged into.|
|~|Current directory|This indicates the directory (folder) that the user is currently inside. When logging in, this defaults to our home directory, the **~** (tilde) is a shortcut for this.|
| $ | Separator | This separates the shell information from the commands that the user types. Different separator symbols are used to differentiate between a standard user ($) and a superuser (#).|
| _ | Cursor | Where the user types commands into the shell.|

## Linux Tips

- Linux is case-sensitive, meaning correct use of upper/lower capital letters are important.
- Many commands don't produce a **success** message when entered. Typically, no output means that the command has completed without error.

## Basic Commands

### whoami

```shell
whoami
```

This displays the current system's username.

### id

```shell
id
```

This displays the current **UID (User ID)**, which is used to manage OS permissions.

### pwd

```shell
pwd
```

This command displays the user's current working directory which is essentially, their current location within the file system.

## Linux Path Shortcuts

Below are some **path shortcuts** used by Linux shells.

### Current Directory

`.` 

This refers to the directory the user currently resides. For example, if the user was currently within:

```shell
/home/user/documents
```

Then:

```shell
./file.txt
```

Would essentially mean:

```shell
/home/user/documents/file.txt
```

`.` can also be used to run a program from the current directory, such as:

```shell
./script.sh
```

Here, `./` tells shell to run from the **current** directory.

### Parent Directory

`..`

This refers to the directory **one level above the user's current directory**. For example:

```shell
/home/user/documents
```

The parent directory here is:

```shell
/home/user
```

Therefore:

```shell
cd ..
```

Moves the user up one directory.

This shortcut can also be combined with a path to perform a similar action. For example, let's assume that the user's directory structure looked like this:

/home/user
├── Documents
└── Downloads

Then they type:

```shell
cd ../Downloads
```

With this, the shell completes two actions. Starting from left to right, `..` tells it to move from `/home/user/Documents` back up to the parent of the current directory, `/home/user`.

Now that the user is at `/home/user`, the shell then sees `/Downloads` and moves into that directory (`/home/user/Downloads`), as it is connected to the home directory.

A key component to extending the `..` shortcut is the `/` (slash), which when placed between path components, is telling shell to **enter/go through this** file, folder, directory, etc...

The directory structure and current location is also an important detail when using this combined command. For example, if the user was instead located at:

```shell
/home/user/Projects/Website
```

Then typed:

```shell
cd ../Downloads
```

By using the same command, shell would interpret this as, move into the parent directory (`/Projects`) and then move into `/Downloads`. Ultimately attempting to move to:

```shell
/home/user/Projects/Downloads
```

### Home Directory

`~`

This is shorthand for the current user's home directory. For example, typing `cd /home/user` would take the user to their home directory. However, `~` is a Linux shortcut which achieves the exact same thing.

This is useful because it means that the user doesn't need to type the entire path, or move manually through the directories just to reach home.

## Listing Files/Directories

### ls

```shell
ls
```

This command lists the contents of the current directory.

For many commands, additional behaviors or features can be controlled via their **flags**.

### Flagged ls Example

```shell
ls -l
```

`-l` tells the `ls` command to use **long listing format**, meaning that the user receives additional information such as file:

- Permissions
- Ownership
- Size
- Modification Time

### Combining Flags

We can also combine flags like:

```shell
ls -la
```

Here, `-l` adds the long list format and `-a` includes the **hidden files**.

## Standard Flag Formatting

Flags are often written with `-` or `--`. 

### Short Flag

A **short flag**, which are normally one letter, often use a single hyphen. For example:

```shell
ls -l
```

```shell
ls -a
```

```shell
ls -h
```

```shell
ls -R
```

Although, this rule isn't absolute as with examples such as `ls -la`, which is a two letter flag.

### Long Option

A long option normally uses two hyphens, such as:

```shell
ls --all
```

*For `ls`, `--all` performs the same function as `-a`.

Long options are often easier to understand because the name describes what the option does.

## Moving Around

We can use `cd` (change directory) to move around the directory structure.

```shell
cd
```

This on its own, without a destination, will take the user to their home directory.

However, by specifying a destination like `/` (root), then `cd` will move us their instead.

```shell
cd /
```

Alternatively, we can move to a specific location, using an **absolute path**:

```shell
cd /var/lib
```

We can use `pwd` to confirm our current directory.

