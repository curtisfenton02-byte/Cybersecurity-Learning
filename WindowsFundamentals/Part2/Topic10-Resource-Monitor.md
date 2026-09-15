# Resource Monitor

The Resource Monitor (`resmon`) is another tool which can be launched from the System Configuration window.

This tool is similar and yet more advanced than Task Manager as it provides further details about what processes are doing with CPU, RAM, disks, and the network.

It can show the resource usage of both individual and combined processes. 

Plus this tool can provide some service-management functionality. For example, from the relevant interface, we can perform such actions as:

- Start
- Stop
- Pause
- Resume

### Closing Unresponsive Applications

Initially, if a program stops responding, this tool can allow us to terminate it. However, terminating an application can cause unsaved work to be lost.

### Deadlocked Processes

Furthermore, Resource Monitor can help identify deadlock situations. This refers to when two or more processes/threads are effectively waiting for each other and therefore cannot continue, resulting in an application appearing to be frozen.

### File Locking Conflicts

Imagine a program has a file open, and we try to delete or modify the file, but Windows doesn't allow this because the file is currently in use. Resource Monitor can help us to determine which process it is that has opened the file. In other words, this process is effectively holding a handle to the file.

## Overview

Within the *Overview* tab, Resource Monitor has four sections:

1. CPU
2. Disk
3. Network
4. Memory

These same four sections have corresponding tabs across the top of the panel. Each tab has additional information for each section.

Resource Monitor also has a graphical view in real-time for each section.

## CPU

This tab displays current processor activity and is broken down into several useful areas.

| CPU Sections | Purpose |
|--------|---------|
|Processes|This subsection lists processes and shows their CPU activity.|
|Services|This associates Windows services with processes. Services often run inside a process.|
|Associated Handles|This shows handles associated with processes. A handle is a reference that a process uses to interact with something managed by Windows, such as Files, Registry keys, Events, other system objects.|
| Associated Modules | This displays modules loaded into a process. A module is an executable component such as **chrome.exe** or **something.dill**.|


## Memory 

This tab focuses on RAM usage, meaning that the display will list processes and their memory consumption.

### Memory Graphs

Resource Monitor also breaks memory down into different states, represented by a bar graph in the **Physical Memory** box. These terms are:

- In Use
- Modified
- Standby
- Free

| Term | Basic Description |
|--------|---------|
|In Use|Memory currently being used.|
|Modified|Memory containing changed data that may need to be written back to storage before the memory can be reused.        |
|Standby|Memory containing cached data that can potentially be reused if another program needs the RAM.         |
| Free | Memory that currently isn't holding useful data and can be allocated.|

## Disk

The Disk tab is particularly useful for investigating disk activity. It informs us of which processes are accessing storage and what they're accessing. 

### Disk Activity

This provides further information about what files are actually being accessed.

### Storage Information

Provides information related to the disks themselves, such as:

- Disk
- Disk activity
- Response time
- Queue length

These help indicate how heavily a storage device is being used. For example, disk queue length provides an indication that requests are waiting to be handled by the storage device.

## Network

This tab shows network activity associated with individual processes. This is extremely useful because it can inform us on which programs are actually communicating over the network.

### Network Activity

This provides more detailed information about the network connections being made. For example, the address to which the process is connected.

### TCP Connections

This focuses specifically on TCP network connections and displays such information as:

- Process
- Local address
- Local port
- Remote address
- Remote port
- Packet loss
- Latency

### Listening Ports

This shows network ports on our computer which processes are listening on. Essentially, informing us that a process is waiting for incoming network connections on this listed port.