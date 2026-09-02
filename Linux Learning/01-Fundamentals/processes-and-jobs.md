# What is a Process?

To understand a process, we must first understand a program.

- Program: a passive, saved file of code which lives on the computer's hard drive. 
- Process: the active execution of that code loaded into the computer's memory (RAM).

For example let's look at a common program, Chrome. 

- When Chrome isn't running, it is considered a program which is stored on our computer's disk.
- When Chrome is running, it becomes a process which is created and managed by Linux.

Another example would be if we run commands within the terminal, such as:

```bash 
ls
```

This causes Linux to run the `ls` program as a process. Typically, the process starts, does its job, and then finishes almost immediately. 

However, this is not always the case as some processes, such as Chrome, continue running until closed by the user.

## Processes Have a Process ID (PID)

PID is simply an identification number Linux assigns to a process which helps distinguish it from other processes on the machine. For example, Linux may have:

- Chrome PID: 2417
- Terminal PID: 3104
- SSH PID: 882

### Why Does the PID Matter?

Having a PID for each individual process, allows us to distinguish between duplicate processes, such as two instances of Chrome. This is useful when we want to perform a particular process on a process, such as:

```bash 
kill 2417
```

## The Process ID 1

When Linux first boots up, the kernel starts and then PID 1, which on many modern Linux distributions is systemd, also starts. 

Like a family tree, every process is usually started by another process. This initial process is called the parent whilst the subsequent processes are called the child.

Systemd is the process manager, meaning that it can start, stop and restart services. As a result, if a service ever crashes or upon system reboot, systemd is responsible for automatically restarting/starting up these services. We can view systemd in the terminal by entering:

```bash 
ps -p 1
```

The child process of systemd (PID 1), will run as its own individual process to make it easier for us to identify but is technically still under the control of systemd and also shares its resources.

A practical example of a process is how when we open a Linux terminal, we are then interacting with a **shell**, which itself is a running process. A common shell is `bash` and is often represented as `user@linux:~$`.

When we execute other commands, such as:

```bash 
python script.py
```

The shell starts another process, this being a child process, from the shell (parent process) which temporarily takes over the terminal until it has finished. At which point, the child process ends, and we're returned to the shell.

## Foreground Processes

When we run a command normally, it usually runs in the foreground. This means that our shell is waiting for the process to finish before allowing us to use that same shell prompt to enter another command. 

For example, suppose we run:

```bash 
python long_program.py
```

This hypothetical program may take five minutes to complete, meaning that our terminal is essentially occupied by this process until then. 

## Background Processes

Linux also allows processes to run in the background, meaning that even whilst the process is running, the shell remains free to accept another command.

We would instruct Linux to run a process in the background by adding the **&** symbol to the end of the command. For example:

```bash 
python long_program.py &
```

As a result of running a process in the background, the shell will likely create and manage a **job number** which is shell's way of tracking commands that it has started.

This is not to be mistaken as the PID, which is Linux's identifier for the process.

Example job number and PID:

```bash 
[1] 2417
```

We can interpret this as:

- Job number: 1
- PID: 2417

### Jobs

We can visually see jobs associated with our current shell by using:

```bash 
jobs
```

Example output:

`[1]+ Running  python script.py &`

### fg and bg

These are commands which allow us to move jobs between the foreground and background. 

```bash 
fg
```

This brings a background job into the foreground.

```bash 
bg
```

This is used to continue a stopped job in the background.

## Viewing Processes with `ps`

A fundamental command when dealing with processes is:

```bash 
ps
```

`ps` stands for **process status** and its purpose is to display information about the current shell's running processes to the user. Such information includes:

|Shell|Information|Meaning|
|----|------|
|PID| Linux's identifier for the process.|
|TTY| which terminal window started a process.|
|TIME|represents how much CPU time has been consumed by this process.|
|CMD|is the actual running command.|

### `ps aux`

To gain a more in-depth view of the processes running on the system, we could instead run:

```bash 
ps aux
```

This will allow us to see columns such as:

- USER
- PID
- %CPU
- %MEM
- COMMAND

This is helpful when investigating what systems are being run and by whom. 

## `top`

**top** shows mostly the same information as `ps aux` but rather than being a screenshot of processes, top displays a live and updating feed.

This format, is useful for seeing CPU and RAM usage. As well as busy processes.

## Stopping Processes

Sometimes a process needs to be stopped, so Linux provides these commands.

### SIGTERM

```bash 
kill 2417
```

Linux interprets this as:

```bash 
kill -SIGTERM 2417
```

Or:

```bash 
kill -15 2417
```

Despite its name, `kill` doesn't violently destroy a process but instead sends a signal to the process with a matching PID (2417). This signal requests the process to terminate itself gracefully. The process can receive this signal and respond to it by:

- Saving its data
- Closing files
- Cleaning up resources
- Then exiting

### SIGINT

```bash 
kill -SIGINT 2417
```

Or:

```bash 
kill -2 2417
```

This interrupts the process and for command-line programs, this often results in termination.

### Kill -9

```bash 
kill -SIGKILL 2417
```

Or:

```bash 
kill -9 2417
```

This sends a forceful signal that immediately terminates the process, meaning do not attempt to clean up or save the process, just destroy it. As a result, this method should generally be reserved for situations where normal termination doesn't work. 

### SIGSTOP

This is slightly different to the previous `kill` examples as it **pauses** the process instead of deleting it.

```bash 
kill -SIGSTOP 2417
```

ALternatively, we can also use SIGSTOP's signal number which, on Linux, is:

```bash 
kill -19 2417
```

Then we can later tell the process to continue using either:

```bash 
kill -SIGCONT 1234
```

Or:

```bash 
kill -18 2417
```

It is important to note that if we are wanting to stop/delete a process which is running in the foreground, we will often be unable to enter the above commands into the terminal as it is currently occupied.

Therefore, we can instead use keyboard shortcuts as a convenient way of communicating with the foreground job.

### Keyboard Shortcuts

`Ctrl+C` - sends SIGINT which terminates the process.

`Ctrl+Z` - sends SIGTSTP which stops the process but does not delete it.

`Ctrl+

## Connecting Processes Back to Users

Processes run under user identities, which means their ability to access files and system resources is influenced by that user's permissions. This reinforces an important security boundary that a service running as a restricted account has fewer privileges than a service running as root. 

By using previously mentioned commands which interact with the system's processes, we can deduce what process is associated with each user and therefore determine their permissions:

|Shell|Information|Meaning|
|----|------|
|user1|2417|Chrome|
|mysql|1934|mysql|
|root|812|sshd|

Therefore:

- Chrome runs as user1 and gains their permissions.
- Mysql runs as mysql and gains their permissions.
- SSHD runs as root and gains their permissions.

## Cybersecurity Relevance

Commands such as:

```bash 
ps aux
```

Are particularly important when investigating a Linux machine as running processes reveal what software and service are active and which users they run under. Examining this information can help us understand the system's attack surface, identify unusual activity and determine which privileges different services posses. 