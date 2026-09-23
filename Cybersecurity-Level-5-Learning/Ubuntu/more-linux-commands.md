# Part Two of Basic Linux Commands

## Creating Directories & Files

### mkdir

```shell
mkdir
```

This command creates a new directory (folder) inside our current working directory. For example, if we are currently within:

```shell
/home/user
```

Then:

```shell
mkdir lab-1/
```

Will create `/home/user/lab-1`, which we can view by entering `ls`.

### Specifying a Path

```shell
mkdir lab-1/docs/
```

By specifying a path (`lab-1/docs/`) when using `mkdir`, we can create a directory (`docs/`) within another (`lab-1`) directory. 

Again, we can check that this directory exists by either entering `ls` from within the `lab-1` directory, or with:

```shell
ls lab-1
```

However, `lab-1` must already exist for `docs` to be created within it.

Unless, we incorporate the `-p` **option** to automatically nest a series of new directories with one command. For example:

```shell
mkdir -p lab-1/docs/file-1
```

## Space Delimited

It is important to note that Linux commands are **space delimited**, meaning that the *space* character acts as a separator for list items. For example, if we enter:

```shell
mkdir lab-1/docs/New Directory
```

Now, Linux has created two directories, **New** and **Directory** instead of one. This is because, `mkdir` treated this as a list of directories to create.

To resolve this, we can enclose the name of the directory in quotation marks, ensuring that Linux treats it as one directory. For example:

```shell
mkdir lab-1/docs/"New Directory"
```

Alternatively, we can use `\` to escape each space. The result is the same as quotation marks, just a different format:

```shell
mkdir New\ Directory
```

### Creating a File

```shell
touch lab-1/docs/notes.txt
```

Now that we have already created `lab-1/docs/`, we can then create a `notes.txt` file within the `/docs` directory, using the `touch` command.

Note that `-p` doesn't work the same way for all commands. For example, `-p` works with `mkdir` to create nested directories. However, it performs a behavior when paired with `touch` for example.  

## Editing & Viewing Files

### echo

```shell
echo "Adding text from the command line." > lab-1/docs/notes.txt
```

The `echo` command adds text from the command line into a file, in this case `notes.txt`.

Note that if `notes.txt` didn't already exist inside `lab-1`, then Linux would create the file for us and then adds the text into it. 

However, if `notes.txt` did already exist, and contained pre-written text, then by using `echo`, we are replacing the original text with our new text.

### cat

```shell
cat lab-1/docs/notes.txt
```

The `cat` command, short for **concatenate**, allows us to view the contents of the `notes.txt` file, which in this case would be the previously added message.

## Dealing with Long Files

If a file contains a lengthy amount of text, trying to read said text with `cat` will send the entire file to the terminal. 

However, most terminals have a **limited memory buffer**, meaning that the text will likely scroll past the screen, making it unreadable.

We can view a demonstration of this by entering:

```shell
cat /var/log/syslog
```

Here, we are reading a condensed version of the `syslog` file content, which contains records of events reported to the system logging service. 

As this is a continuously growing record of system activity, it can result in thousands or even millions of lines over the span of hours/days.

### | less

```shell
cat /var/log/syslog | less
```

By using `|`, Linux takes the output from `cat` and passes it to `less`, which then lets us view the file **a screen full at a time**, making it much easier to read.

Whilst within this viewing screen, we use these **basic movements** to traverse the file:

| Key | Action |
|--------|---------|
|Lower-arrow key|Moves down one line of the text.|
|Upper-arrow key|Moves up one line of the text.|
|Space|Moves down one screen.|
|b| Moves up one screen.|
|Enter|Moves down one line.|
|q|Quit the `less` screen.|
|g|Go to the beginning of the text.|
|G|Go to the end of the text.|

### Clearing a Linux Terminal

```shell
clear
```

This command clears the visible terminal screen while leaving our command history intact.

Alternatively, we can use a keyboard shortcut: `Ctrl + L`, which does the same thing as `clear`.

### Appending Text To a File

```shell
echo "Continued text." >> lab-1/docs/notes.txt
```

By adding a double `>>` to our `echo` command, we are now **appending** the "Continued text" message to the pre-existing `docs/notes.txt` file. This text will be added to the next line in the file.

Again, if the `notes.txt` file didn't exist, then `echo` would create it for us.

### Counting a Text File

The `wc` command stands for **word count**. It can count several things depending on the **option** we give it. For example:

```shell
wc -w lab-1/docs/notes.txt
```

By adding the `-w` option, we are telling Linux to count the words in the file.

```shell
wc -l /notes.txt
```

`-l` counts the lines in the file.

```shell
wc -c /notes.txt
```

`-c` counts the bytes.

We can also use multiple options at once, such as:

```shell
wc -lw notes.txt
```

This counts both lines and words.

## Copying Files & Directories

### Copying a File into a Directory

We currently have this directory structure:

lab-1/
├── notes-2.txt
└── docs/

Assuming that we are still within our home directory, `/home/user/` By using:

```shell
cp notes-2.txt lab-1/docs
```

We can create a copy of the `notes-2.txt` file into `docs/`, resulting in:

```shell
lab-1/docs/notes-2.txt
```

### Copying a File to a New Name

We don't have to specify a directory. Instead, we can just copy the contents of a file into a simultaneously created file. For example:

user/
├── home/
└── notes.txt

The notes.txt file contains "Hello".

By entering:

```shell
cp notes.txt backup.txt
```

Linux will now create a backup.txt file from our home directory and copy the text from notes.txt into it.

Essentially, `cp` is about copying a source, to a destination. This destination can be a directory or a new filename/path.

### Copying Directories

Suppose we have:

lab-1/
└── docs/
    ├── notes.txt
    └── todo.txt

```shell
cp docs backup/
```

We usually, couldn't use standard `cp` to copy the contents of `docs/` directory into a new `backup` directory.

Instead, we need to use `-r`:

```shell
cp -r docs backup/
```

This can now copy the entire directory and its contents

### Renaming

Most Operating Systems don't have a specific *rename* command, besides Windows. They simply use the move `mv` command instead.

```shell
mv lab-1/docs/notes.txt lab-1/docs/notes-backup.txt
```

Now the notes.txt file should've been renamed to notes-backup.txt.

The structure of the `mv` command is essentially:

**mv source destination**

This same pattern can be used to move directories too. For example:

```shell
mv docs backup/
```

### Moving a file/directory to the user's home directory

We can also move a file/directory from a specific directory, to our home directory by utilizing `~`.

```shell
mv lab-1/docs/notes-2.txt ~
```

Now `notes-2.txt` is within the home directory.

## Deleting 

For Linux, the main deletion command is `rm`, which stands for **remove**.

### Deleting a File

```shell
rm notes.txt
```

### Deleting Multiple Files

We can specify the names of files we intend on deleting.

Assuming that we are within the directory which contains these three files:

```shell
rm notes.txt test.txt example.txt
```

All three of these files will be removed.

### Deleting a Directory

`rm` normally won't delete a directory on its own. Instead, we would need the `-r` option:

```shell
rm -r lab-1
```

By adding the additional `-r` flag, Linux tells `rm` to delete both the directory and its contents.

### Empty Directory Alternative

For an **empty** directory, we can use:

```shell
rmdir lab-1
```

However, `rmdir` will fail if the directory contains files or other directories.

### Force Removal

`rm -rf` combines two options for the `rm` command:

1. `-r`: recursive
2. `-f`: force

Together, they recursively remove the folder and everything inside it, without asking for confirmation in situations where `rm` otherwise might.

**By cautious with this command as it can remove large amounts of data very quickly.**

## Basic Searching

To locate an **executable** within the OS, and display its full path, we can use the `which` command.

```shell
which ls
```

When we run this command, Linux searches our configured command locations and tells use which executable would be run when we type `ls`.

### What is an Executable?

An executable is a file that the operating system can run as a program.

For example, when we type `ls`, Shell then needs to find a program file called `ls` to run. Within our Ubuntu system, this program is likely located within:

```shell
/user/bin/ls
```

### Searching Multiple Executables

We can provide various executables for Linux to find simultaneously. For example:

```shell
which perl python3 bash
```

Response:

```shell
/usr/bin/perl
/usr/bin/python3
/usr/bin/bash
```

### Whereis

```shell
whereis ls
```

The `whereis` command is similar to the previous `which` command but provides further scope of the executables, such as their:

- Source files
- Manual pages

## Basic OS Info

### hostname

```shell
hostname
```

This command identifies the name of our current system.

### hostname -I

```shell
hostname -I
```

This command uses the `-I` flag to view the IP addresses assigned to the system.

### lsb_release -a

```shell
lsb_release -a
```

This command allows us to view the current OS version information, including:

- Distributor ID
- Description
- Release Date
- Codename

### hostnamectl

```shell
hostnamectl
```

This displays additional system information, including the **kernel version and CPU architecture**.

## Getting Help

To receive a brief, one-line description as to what a command does, we can attach the `whatis` command. For example:

```shell
whatis ls
```

Alternatively, if we want a more detailed description of the command, including usable flags and options, we can query the manual by attaching the `man` command.

```shell
man ls
```

To exit the manual view, press the **q** button.