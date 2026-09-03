# What is an Operating System?

The simplest way to describe an operating system (OS) is as software which sits between our applications and the computer's hardware. 

For example, suppose we open Chrome and download a file. Chrome doesn't directly communicate with our computer's SSD. Instead, Chrome asks Windows to perform operations such as creating a file and writing data.

Windows then coordinates with the hardware. Basically, Windows acts as a layer of abstraction between the software and hardware.

## What is an operating system responsible for?

### Processes

The operating system runs programs and their resources.

### Memory

It provides programs with RAM and manages how that memory is utilized. 

### Files

Also, the operating system manages storage, file systems and access to files. 

### Hardware

Plus the operating system is responsible for communicating with devices through drivers. 

## Windows NT

Modern Windows, including Windows 10 and Windows 11, are apart of the Windows NT family.

This means that when we come across documentation referring to such information as NT kernel, NTFS, or NT system components, it is referring to the underlying Windows NT architecture.

## User mode vs kernel mode

User broadly separates code into two sections:

### User Mode

- Applications
- Chrome
- Discord
- VS Code
- PowerShell
- Other common user programs 

### Kernel Mode

- Windows kernel
- Drivers
- Core system components

## Why separate them?

They are separated this way to keep applications from having unrestricted access over the computer. For example, imagine if Chrome had unrestricted access to everything (RAM, CPU, SSD, etc), a bug or malicious program could potentially do enormous damage across the system.

Hence, why ordinary applications run in **user mode**, where their access is restricted instead of in **kernel mode**, which has much greater privileges.

## The Windows kernel

The kernel is the central part of the operating system. It is responsible for coordinating many of the fundamental resources of the machine. The kernel deals with many system components:

- Processes
- Threads
- Memory
- Hardware interaction
- Security mechanisms
- Low-level system operations

## What is a Process?

A process is a running instance of a program. A process provides the resource/container context. These resources include:

- Threads
- Memory
- Handles
- Security information

## Processes vs Programs

A program is code stored on a disk.

## Threads

A process can contain one or more threads. A simplified model would look like:

Process
│
├── Thread 1
├── Thread 2
└── Thread 3

Each thread represents a path of execution within the process. 

## Drivers

A device driver is software which allows Windows to communicate with a particular type of hardware. Some drivers operate with extremely high privileges which can be dangerous because if a driver becomes compromised, this could provide a hacker with unrestricted access.

## System calls

Applications cannot simply perform arbitrary privileged operations themselves. Instead, they need to request certain operations from the operating system.

For example, an application may need Windows to:

- Create a file
- Allocate memory
- Create a process
- Communicate with a device

As a result, the application requests the operation through Windows' system interfaces. The kernel then carries this operation out based on the relevant security and operating-system rules. 

## Task Manager Example

Take this example task manager information:

|Information||Details|Meaning|
|----|------|----|
|Process|explorer.exe|this is the Windows Explorer process. It provides a large amount of the graphical Windows shell we interact with (desktop, taskbar, Start menu, File Explorer windows).|
|PID|13968|this is the Process ID Windows gives to each running process as an identifier.|
|User|user2|the account/security context associated with the process.|
|CPU|0%|how much of the CPU a process is using.|

## Location

Further analyses on the example explorer.exe process. When within Task Manager, we can right-click a process to preview a variety of performative options. One of which is **Go to details**. By clicking this option, we will then be taken to the Details panel which will contain the information listed above. 

Carrying on, we can then right-click the same process within this tab to be given more useful options. This time, we want to click **Properties** which will open up a new tab with even more information about this process.

In this case we are identifying the **Location** of the process:

- C:\Windows

This informs us that explorer.exe is located in C:\Windows. This is a standard location for this such process. However, what if it was located here instead:

- C:\Users\user2\Downloads

This would be suspicious and could point to a malicious executable which was created by a hacker trying to appear as a legitimate process.

Therefore, we shouldn't trust a process name by itself and instead should always investigate where it came from and how it is behaving.

## Parent and Child Processes

Windows processes can create other processes. This forms a process tree with the first process being the **parent** and the subsequent processes being the **child**.

This tree would be more informative than simply seeing a single suspicious process running by itself.

### Task Manager Demonstration

Whilst still in the Details panel, right-click a process to search for the **Analyze wait chain** option.

This will inform us on whether a process is running normally.

### Command Prompt Demonstration

Enter these commands into the Command Prompt:

```bash
tasklist
```
This provides a list of running processes, along with other information:

- Image Name
- PID
- Session Name
- Session#
- Mem Usage

```bash
tasklist /?
```

This provides a help output for the list. 
  

