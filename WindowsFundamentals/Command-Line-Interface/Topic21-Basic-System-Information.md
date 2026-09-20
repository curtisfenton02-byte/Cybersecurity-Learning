# Introduction to the Windows Command Line Interface

## Why use the CLI?

Whilst a Graphical User Interface (GUI) is considered more intuitive for novice users, the CLI is more efficient once mastered.

There are many major advantages to using a CLI besides speed and efficiency. Examples are:

| CLI Benefit | Description |
|--------|---------|
|Lower Resource Usage|CLIs require fewer system resources than graphic-intensive (GUIs). This becomes more impactful for older hardware or systems with limited memory. Plus systems using cloud computing will use less resources and initially lower their bill.|
|Automation|Users can use CLI to easily create batch files or scripts with necessary commands.|
|Remote Management|CLI allows for convenient use of SSH when managing a remote system such as a server, router, or an IoT device. This is even more advantageous for systems using slower networks and limited resources.|

## Secure Shell (SSH)

SSH is a cryptographic network protocol which allows users to securely connect to and communicate with a remote computer over an unsecured network.

### What is the difference between SSH and Windows Remote Desktop Connection (mstsc.exe)?

The main difference between these two remote desktop connection protocols, is that SSH is primarily a **remote command-line access protocol**, whilst RDP provides a **graphical Windows desktop session**.

For example, when a user runs SSH, they are establishing an SSH style session with a remote machine. This means that they are essentially controlling the machine through its **shell** (terminal) and would run commands like `ls` and `cd`.

SSH is most commonly associated with Linux/Unix systems, although Windows also supports OpenSSH.

Whereas RDP, is Microsoft's Remote Desktop Connection client. Instead of receiving a terminal, the user would get something resembling the actual Windows desktop. 

### Using TryHackMe's AttackBox to Establish an SSH Connection

I am going to be practicing setting up/using SSH within TryHackMe's lab rooms and by running its AttackBox from my browser.

Here are the steps to establish an SSH connection from the AttackBox to a Virtual Machine:

1. Start the AttackBox's terminal by clicking the **terminal icon**.
2. To connect with the target VM, issue the command `ssh user@10.129.170.154` (*user* being the username/account name we're trying to access on the VM).
3. If it is our first time connecting with the VM, we will be asked whether we trust the connection. Answer with yes or no.
4. Finally, enter the password associated with the user account on the VM.

## Initial Commands

Before issuing commands, it is important to note that a user can only issue the commands within the Windows Path.

A PATH is a list of **directories** that Windows checks when a user types a command without specifying where the **program** is located. For example, suppose Windows has these programs:

- C:\Windows\System32\ipconfig.exe
- C:\Windows\System32\cmd.exe
- C:\Windows\System32\whoami.exe

Now because `C:\Windows\System32` is normally included in PATH, the user can simply type:

```cmd
ipconfig
```

As opposed to including the program's location as well:

```cmd
C:\Windows\System32\ipconfig.exe
```

Instead, by only typing the name of the program, Windows searches the directories in PATH and finds `ipconfig.exe`.

### Set

```cmd
set
```

This Windows command prompt will display the **Windows environment variables**.

An example would look like:

`Path=C:\Windows\system32;C:\Windows;C:\Program Files\Python;C:\Program Files\Git\cmd`

The important part of this terminal line is `Path=`, as everything after this is a list of directories separated by `;`.

Therefore, when we type `set` into the terminal, we can then see which directories Windows will search when we enter a following command.

However, this also means that if we type the name of a program which isn't within the Windows Path, Windows will not recognize it. For example:

`C:\Tools\myprogram.exe`

Now assuming that `C:\Tools` exists, but it is not within our PATH, then simply typing `myprogram.exe` will not work.

Instead, we would have to specify the complete path.

## Basic Commands

### Ver

```cmd
ver
```

This command tells us the operating system version.

### Systeminfo

```cmd
systeminfo
```

This command lists various information about the system such as OS information; system details; processor and memory specifications.

### Driverquery

```cmd
driverquery
```

This command lists information about the device's installed system drivers.

### More

This is a useful trick for condensing down long outputs by adding `| more` to the end of the command. We can then cycle through different sections of this information by pressing the **space bar**. For example, when using the `driverquery` command:

```cmd
driverquery | more
```

To exit this viewing mode, or interrupt any other in-process command, press **CTRL + C**.

### Help

```cmd
help
```

When paired with another command, this provides helpful information about that specific command. For example:

```cmd
help ver
```

Output: *Displays the Windows version*.

### cls

```cmd
cls
```

Clears the Command Prompt screen.