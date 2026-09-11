# System Configuration and Advanced System Settings

The System Configuration utility (MSConfig) is for advanced troubleshooting, and its main purpose is to help diagnose startup issues.

There are several methods to launch System Configuration, one of which being via typing `msconfig` into the **Start Menu**. Then clicking the **System Configuration** option. However, we would need local administrator rights to open this utility.

## System Configuration Breakdown

The utility has five distinct tabs across the top of the window. These are:

1. General
2. Boot
3. Services
4. Startup
5. Tools

## General Tab

Within this tab, we can select which devices and service for Windows to load upon boot. The options are:

|Tab|Device and Service upon boot|
|----|----|
|Normal|Load all device drivers and services.|
|Diagnostic|Load basic devices and services only.|
|Selective|Choose 1 or more of these 3 devices and services to load: system services, startup items and/or original boot configuration.|

## Boot Tab

When a computer boots, Windows goes through the process of loading the operating system. The Boot tab allows us to change settings that affect this process. 

### Starting Operating System

The Boot tab can be used to configure which operating system Windows should start by default, if there are multiple. For example, we could choose between Windows 11 and Ubuntu, if they are both available.

### Safe Mode

Another setting we can configure is the option to boot Safe Mode, which starts Windows with a minimal set of drivers and services. This is useful for troubleshooting problems because it prevents many normal programs and drivers from loading.

### Further Options

The Boot tab also contains options for controlling things such as how Windows handles the boot process and debugging. These options include:

|Boot Option|Controls|
|----|------|
|Timeout|how long Windows waits before automatically selecting the default operating system.|
|Safe boot |starts Windows in Safe Mode.|
|NO GUI boot| prevents the Windows graphical boot animation from being displayed.|
|Boot log|records which drivers were loaded during startup.         |
|OS boot information|displays driver information while Windows is starting.|

## Services Tab

This tab lists all the services configured for the system regardless of their state (running or stopped). 

A service is a program that runs in the background to provide a specific function, often without requiring us to interact with it directly. 

As well as the Service name, this tab also lists the Service's:

- Manufacturer
- Status
- Date Disabled

## Startup Tab

The System Configuration utility isn't a startup management program. As a result, no information typically appears within this tab, and instead we are advised by Microsoft to use the Task Manager (taskmgr) to manage (enable/disable) startup items.

When using a Windows server, instead of a Windows client system, we can only view user-level startup items through the Startup folder itself.

To access this folder, press **Win + R**, which opens the Run Dialog. Then by entering `shell:startup`, Windows will display all startup programs as shortcuts or executables that are configured to run automatically the next time a user logs in. 

## Tools Tab

This tab contains a list of various utilities (tools) that we can run to configure the operating system further. Each tool has a brief description beside it which provides some insight into what the tool is for. Plus there is another text box containing the command associated with the selected tool.

To run a tool, we can enter its command into the run prompt (Win + R), command prompt or by clicking the **Launch** button in the Tools tab window.

## Advanced System Settings

Windows provides us with additional configuration settings, which we can use to control the system's performance behavior and recovery. To access this option, we can search for **View advanced system settings** in our Windows search bar. This will open the **System Properties** panel.

## Advanced Section

A useful feature of the System Properties panel is in the **Advanced** section, which allows us to configure the settings of the system's Performance, User Profiles, Startup and Recovery.

### Page file

RAM is much faster than storage, but it is limited. As a result, when Windows is running low on RAM, it can move some of the less-important data from RAM into a file on the SSD/HDD called the page file. This provides Windows with virtual memory, allowing it to keep functioning when there isn't enough physical RAM available.

However, the downside to using the SSD/HDD is that it's slower than RAM. Therefore, heavy use of the page file can make the system slower.

To view and configure the page file settings, we can navigate the System Properties panel and enter the Performance settings, located in Advanced, where we will then find further options such as **Processor scheduling** and **Virtual memory**. 

Virtual memory informs us on the page file size configured for the drives. As well as:

- The drive where the page file is stored.
- The initial size (MB).
- The maximum size (MB)
- Whether Windows manages the size automatically.

## Crash Dump File

Windows can create a crash dump file whenever it encounters a critical error, such as a Blue Screen of Death. This crash dump helps the administrator or analysts understand what went wrong during the crash.

This is another adjustable settings option in System Properties + Advanced + Startup and Recovery + Settings. Here we will find different settings for the system's startup and recovery. The, **write debugging information** dropdown informs us of the type of crash dump configured for the system. Windows supports different dump types, including:

- Automatic memory dump
- Kernel memory dump
- Small memory dump (256KB)
- Complete memory dump
- None

Ultimately, this setting's purpose is to show how much information windows will save in the crash dump when a system crash occurs.

# Change UAC Settings

By launching the UAC tool from the System Configuration *Tool* section, the UAC settings window will appear. Here we can adjust the slider to one of the four default security levels, each of which controls how Windows alerts us when apps or users try to make changes at the system level. Each security level has its own description:

| Security Level | Description |
|------------|---------------|
| Always notify|This is the highest security level. Windows notifies us whenever any apps or we ourselves try to make changes, and the desktop temporarily darkens while the UAC prompt is displayed (Secure Desktop).|
|Notify for apps|Windows notifies us only when *apps* try to make changes, but not when we change Windows settings ourselves. This option is enabled by default.|
|Notify without dimming|Again only notifies for apps but doesn't dim the screen when UAC prompt is displayed.|
|Never notify|Notifications are turned off. Windows will not warn us about any changes made by ourselves or any apps.|

### How to find the Executable File (.exe) for a Program

If we want to figure out purely the executable filename (.exe) of a program, we can:

1. Open Task Manager.
2. Have the questioned program window open.
3. Find the process associated with the program in Task Manager.
4. Right-click the process and choose **Open file location**.
5. This should take us to the .exe responsible for the program.

## Computer Management

Another tool which can be launched from the System Configuration panel is called Computer Management (compmgmt).

This utility has three primary sections:

1. System Tools
2. Storage
3. Services and Applications

## System Tools

### Task Scheduler

With Task Scheduler we can create and manage common tasks that our computer will carry out automatically at the times we specify.

A task can run an application, script, etc., and they can be configured to run at any point in time. This can be during user login or logoff. As well as on a specific schedule, such as every five minutes.

To view the scheduled tasks that are present on the system, we need to open the dropdown list for task scheduler on the left-hand pane of the window. This list should include one option called the **Task Scheduler Library**. 

Some tasks are not recurring but are instead made to run just once at a specific time. In this case, instead of seeing *Triggers: every day at 10:00 AM*, we would see an exact date and time for this non-recurring task. For example, *At 3:00PM on 15/09/2026*.

### Creating a Basic Task

To create a basic task, we need to click on *Create Basic Task* in the Actions column (right pane). We will then be presented with the *Create Basic Task Wizard* window which we can work through to create a task.

### Event Viewer

Back in the Computer Management window, we also have another tool called **Event Viewer** which allows us to view events which have occurred on the computer. These records of events can be seen as an audit trail that can be used to understand the activity of the computer system.

Typically, this information is often used to diagnose problems and investigate actions executed on the system.

Event Viewer has three panes:

1. The leftmost pane provides a hierarchical tree listing of the event log providers: Custom Views, Windows Logs, Applications and Service Logs and Subscriptions.
2. The center pane displays a general overview and summary of the events specific to a selected provider.
3. The rightmost pane has an action column.

There are five types of events which can be logged. Below is a brief description of these types:

| Event Type | Description |
|------------|---------------|
|Error|An event which indicates a significant problem such as loss of data or loss of functionality. For example, if a service fails to load during startup, an Error event is logged.|
|Warning|An event that is not necessarily significant, but may indicate a possible future problem. For example, when disk space is low, a Warning event is logged. For an application to be deemed a Warning event, it must be able to recover from an event without loss of functionality or data.|
|Information|An event that describes the successful operation of an application, driver, or service. For example, when a network driver loads successfully, it may be appropriate to log an Information event. However, it is generally inappropriate for a desktop application to log an event each time it starts.|
|Success Audit | An event which records an audited security access attempt that is successful. For example, a user's successful attempt to log onto the system would be logged as a Success Audit event.|
|Failure Audit|An event which records an audited security access attempt that fails. For example, if a user tries to access a network drive and fails.|

The standard logs are visible under Windows Logs. Below is a brief description about these logs:

| Log | Description |
|------------|---------------|
|Application|Contains events logged by applications. For example, a database application might record a file error. The application developer decides which events to record.|
|Security|Contains events such as valid and invalid logon attempts. As well as events related to resource use like creating, opening and deleting files or other objects. An administrator can start auditing to record events in the security log.|
|System|Contains events logged by system components, such as the failure of a driver or any other system component needed to load during startup.|
|Forwarded Events |This event log is present on Windows PCs which support Windows Event Forwarding (WEF) by default. It provides a place to store events sent from other computers, mainly for centralized monitoring on networks. On a regular PC, this log can simply exist but remain empty because event forwarding hasn't been configured yet.|

Another Log type is CustomLog which whilst not being one of the standard five Windows logs, is still present in some Windows environments.

| Log | Description |
|------------|---------------|
|CustomLog|Contains events logged by applications that create a custom log. Using a custom log enables an application to control the size of the log or attach ACLs for security purposes without affecting other applications.|

### Shared Folders

Shared Folders show us the folders on our computer which have been made available over the network, so that other computers or users can access them.

Within the Shared Folders tool, there is a subsection called Shares which are resources the computer has made available through the Windows network. For example, suppose we have a C:\Projects folder on our computer, Windows can make this folder available over the network by creating a share called *Projects*. Another computer can then access this folder through `\\OurComputer\Projects`. These shared folders are listed in the Shares folder.

There is also **C$** and **ADMIN$** folders which aren't folders which we personally decided to share but rather created by Windows automatically as **administrative shares**.

### C$

This represents the entire C: drive (C:\). The $ specifically hides the share from normal network browsing. An administrator on another computer could potentially access this folder with \\ComputerName\C$, provided they have the required permissions.

### ADMIN$

This typically refers to the Windows directory (C:\Windows) and exists primarily for *remote administration*.

### Permissions

As with any object within Windows, we can right-click on a folder to view its properties, such as Permissions (who can access the shared resource).

### Sessions

Within the Sessions folder, there will be a list of users who are currently connected to the shares, if any.

### Open Files

Any folders/files that the current connected users access will be listed under **Open Files**.

## Local Users and Groups

This section of Computer Management is also accessible by entering `lusrmgr.msc` into the Windows Run prompt (Wind + R). The Local Users and Groups management console is basically a graphical tool for managing who can log into a Windows computer and what local groups they belong to.

### Local Users

The **Users** folder within this interface allows us to view the local accounts on the computer. We can right-click a user to access things such as:

- Set Password: change the account's password.
- Properties: view and configure various account settings.
- Delete: remove the account.
- Rename: change the account's name.
- Disable Account: prevent the account from being used without deleting it.

### Local Groups

The **Groups** folder shows us the machine's local groups. A group is essentially a collection of user accounts which have a particular set of permissions or privileges.

## Performance 

Continuing on with another Computer Management section, we have **Performance**. We can access a more comprehensive overview of the Performance interface by searching for Perfmon in the Windows search bar. Alternatively, we can type `perfmon.msc` into the Windows Run prompt.

Withing Performances' subfolder **Monitoring Tools**, we have a utility called **Performance Monitor**. This section allows Windows to graph performance measurements called **counters**. For example, we could monitor:

- % Processor Time
- Available Memory
- Disk activity
- Network traffic

The graph will visually convey how the values change over time rather than a simple snapshot.

It is useful for troubleshooting performance issues on a computer system, whether local or remote.

### Difference between Performance Monitoring and Task Manager

Whilst Task Manager is designed for quickly viewing current system performance, Performance Monitor provides a more detailed monitoring and analysis of the system's performance overtime. 

### Data from a log file

The Performance Monitor can also display data that Windows previously recorded. For example, we could have Windows collects CPU usage for an hour and then store this information as a log file.

This is useful for analyzing past system performance.

## Device Manager

Next we have Device Manager which allows us to view and configure the computer's hardware and software which grants Windows the ability to communicate with this hardware. We can also open it with `devmgmt` in the search bar or `devmgmt.msc` in Run.

Device Manager contains a list of hardware categories such as:

- Audio inputs and outputs
- Bluetooth
- Display adapters
- Keyboards
- Mice and other pointing devices
- Network adapters
- Processors
- Storage controllers
- System devices

Within each category will be the specific hardware devices installed within the computer.

### Drivers

An important concept behind Device Manager are drivers. Windows needs software called a device driver to communicate with many pieces of hardware. The driver provides the instructions that Windows needs to interact with the device.

### Interacting with a device

By right-clicking a device, we are provided with multiple options, such as:

| Device Option | Description |
|----------|--------|
|Update driver|Look for a newer driver.|
|Disable device|Tell Windows to stop using the device.|
|Uninstall device|Remove the device's driver/software configurations from Windows.|
|Properties | View information about the device, its driver, and any problems Windows has detected.|

### Yellow Warning Symbol

An important feature of Device Manager is the **yellow warning triangle** next to a listed device. This generally means that Windows has detected some type of problem with that device, such as a missing or malfunctioning driver.

We can open Device + Properties + General to view the Devices' status.

## Storage

Within Storage, there is only one other section called **Disk Management**. We can open this directly with `diskmgmt.msc`. This is a system utility used to manage the computer's disks, partitions and volumes. We can view:

- Which physical disks are installed
- Which partitions exist on those disks
- Which drive letters are assigned
- How much space is available
- Whether a volume is formatted
- Whether space is allocated or unallocated

Plus, we can perform operations such as creating, deleting, formatting, resizing and assigning drive letters to volumes. 

## Disk Management Actions

There are several actions we can perform from within the Disk Management interface. These include:

| Action | Description |
|----------|--------|
|Create a partition|We can take unallocated space and create a new partition from it.|
|Shrink a volume|For example, we could potentially shrink C: = 1TB to be C: 700GB. |
|Extend a volume|Reverse of shrinking a volume, we can C: 700GB into unallocated space (300GB), making it C: 1TB. However, there are restrictions on when Windows can do this, particularly concerning where the unallocated space is located.|
| Assign or change a drive letter | We could have a volume which Windows currently identifies as D: and decide to change it to E:. Although, changing drive letters can cause problems for software which expects a particular path.|
| Format a volume | Formatting prepares a volume with a file system. Normally, formatting destroys the existing file-system contents, so it is an important operation.|
| Delete a volume | We can remove a volume and turn its space into unallocated space. |

## Services and Applications

A service is a special type of application that runs in the background.

Here we can see all the services and their statuses by clicking the **Services** button provided within the Services and Applications interface. Services in this interface are displayed in a list format and contain such information as:

- Service name (this differs from the display name)
- Description
- Status
- Startup Type
- Log On As

Within this interface, we also have the option to **Start** and **Restart**. Plus by selecting the service's properties option, we can view and manage the:

- Service status
- Description
- Path to executable
- Startup Type

### Startup Type

The four startup type options are presented in a drop-down list. These options are as follows:

| Startup Type | Description |
|----------|--------|
|Automatic|The service starts every time during the Windows system boot.|
|Manual|The service only starts when another process or user triggers it.|
|Disabled|The service should not run at all.|
| Automatic (Delayed Start) |Windows starts the service automatically, but waits until after the main boot process has finished before starting. |

### Why delay a service?

Windows has many services that need to run, but not all of them need to start immediately. By allowing Windows to prioritize important services during the initial booting, we are reducing the resource competition and therefore improving the startup responsiveness.













