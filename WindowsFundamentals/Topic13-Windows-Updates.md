# Windows Updates

Windows Update is a Microsoft service that delivers updates for the Windows operating system. These updates can include:

- Security updates
- Bug fixes
- Driver updates
- Feature updates
- Other improvements

Windows Update can also deliver updates for some Microsoft products and components, such as Microsoft Defender.

## Patch Tuesday

Microsoft typically releases its main monthly security and quality updates on the second Tuesday of each month. This day is commonly known as **Patch Tuesday** or **Update Tuesday**.

However, Microsoft doesn't have to wait until the next Patch Tuesday to release an important security fix. If a critical vulnerability or other urgent issue needs to be addressed, Microsoft can release an **out-of-band (OOB)** update outside the normal monthly schedule. These updates can be distributed through Windows Update and other Microsoft update services.

[Microsoft Security Update Guide](https://msrc.microsoft.com/update-guide)

## Accessing Windows Update using a command

Windows Update can also be opened using the `control` command.

1. Open the Run dialog box by pressing **Win + R**, *or* open Command Prompt (CMD).
2. Enter the following command: 

```cmd
control /name Microsoft.WindowsUpdate
```
3. Press Enter.

This command opens the Windows Update page in Windows Settings.

## Windows Updates and Restart Requirements

Windows users have historically been able to delay installing updates, partly because updates require the computer to restart before installation can be completed.

Modern versions of Windows are designed to prevent important updates from being postponed indefinitely. Windows Update automatically downloads and installs updates, and users can **temporarily pause updates** when necessary.

However, pausing only delays the updates; it doesn't permanently disable Windows Update. Once the pause period ends, Windows will check for and install the latest available updates.

### Active Hours

Some updates require a restart to complete their installation, so Windows attempts to perform these restarts at a convenient time by using features such as **Active Hours** to avoid restarting while the device is being used. Alternatively, users can also schedule a restart manually when an update requires one.

### One restart per month

Another feature, certain versions of Windows 11 have now included, is designed to reduce interruptions by combining restart-required updates together, so that they can generally be completed with **one restart per month**.

Certain updates, such as Microsoft Defender security intelligence updates and emergency or out-of-band updates, may still be installed outside this process when necessary.

### Restart Required

The **Restart required** notification indicates that Windows has installed or downloaded an update that needs a restart to complete. Windows may provide options such as **Restart now** or **Schedule the restart**.