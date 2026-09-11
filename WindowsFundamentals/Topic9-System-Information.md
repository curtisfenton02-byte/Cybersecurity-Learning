# Microsoft System Information Tool 

This is another tool available from the System Configuration (msconfig) panel called Microsoft System Information (`msinfo32` in the Run prompt) or msinfo32.exe.

Microsoft System Information gathers information about our computer and displays a comprehensive view of our hardware, system components, and software environment. We can then use these details to help diagnose computer issues.

This tool contains a **System Summary** in the left pane which is divided into three separate sections:

- Hardware Resources
- Components
- Software Environment

System Summary itself displays general technical specifications for the computer, such as processor brand and model.

### To be filled in by E.O.M

Some items within the System Summary might be labelled as "To be filled in by E.O.M" as a placeholder left by the system/firmware manufacturer.

E.O.M generally means Equipment Original Manufacturer and is fairly common with custom-built PCs as there may not be one single computer manufacturer such as Dell, HP or Lenovo. It can also just be a generic placeholder left by the motherboard manufacturer.

Microsoft System Information is necessarily detecting the system model by looking at the physical computer itself. Instead, it reads the *system information exposed by the firmware*, particularly information stored using **SMBIOS/DMI**. 

## Hardware Resources

This section displays how Windows has allocated and configured the computer's hardware resources.

Rather than just listing the computer's hardware, Hardware Resources explains how Windows and the hardware are actually communicating with one another. 

### Conflicts/Sharing

This, being one of the subsections within Hardware Resources, displays hardware resources which are shared between devices or where Windows detects a potential conflict.

Modern systems commonly share resources, so seeing entries here doesn't automatically mean that something is wrong.

### Direct Memory Access (DMA)

DMA allows certain hardware devices to transfer directly to/from RAM without requiring the CPU to handle every individual transfer. Therefore, this section displays to us which devices are using the DMA channels.

### Forced Hardware 

This is a list of hardware resources that Windows has been instructed/forced to allocate to particular devices, rather than being freely assigned through the normal resource-allocation process.

### I/O

This section refers to hardware which communicates with the processor and system through I/O address ranges. 

### Interrupt Request (IRQs)

Hardware devices periodically require the CPU's attention. For example, when they receive data or finish an operation. As a result, the device can generate an interrupt request, which alerts the CPU that it needs to perform certain actions.

The list within this section represents the IRQs that are assigned to each hardware device.

### Memory

Finally, this section displays the memory address ranges assigned to each piece of hardware.

## Components

The next subsection of System Summary is **Components** which contains information specific to the actual hardware devices connected to computer.

For example, this section would list an adapter's:

- Name
- Manufacturer
- MAC address
- Driver information
- IP-related information

System Summary has a fairly broad Components tree, covering many possible types of hardware and Windows components. These categories are used by Windows to organize information about the different hardware. 

### Multimedia

This is a broad category covering hardware used for handling audio/video and related multimedia functions.

### CD-ROM

This refers to the optical disc drives. If our computer has a physical drive capable of reading CDs or DVDs, System Summary can provide information about it here.

### Display

This represents our display adapter/graphics hardware.

### Input

This covers hardware used for input such as:

- Keyboard
- Mouse
- Touchscreen

### Network

This shows the information of our computer's network. For example, our local/private IP address and IP subnet.

There could potentially be more components categories which I have not listed. Ultimately it just depends on the individual PC.

## Software Environment

The third and final subsection of System Summary is **Software Environment** which provides information about software baked into the operating system and software we ourselves have installed.

Other visible details within this section include the system's Environment Variables and Network Connections.

### Environment Variables

Environment Variables are named values provided by the operating system that store information which Windows and other programs can access. This information includes details such as the operating system path, the number of processors used by the operating system, and the location of temporary folders.

 For example, the `WINDIR` environment variable contains the location of the Windows installation directory. This means that whilst our Windows directory is C:\Windows, the environment variable WINDIR stores that location for us as WINDIR = C:\Windows. 

Now when a program needs to access a Windows file, instead of assuming where Windows is installed, it can ask Windows what the value of WINDIR is and Windows would respond with C:\Windows. The program can then construct the path it needs to get to the Windows file (C:\Windows\System32/example.dill).









