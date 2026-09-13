# Windows Security

According to Microsoft, Windows Security is the central location for managing the security features that help protect our device and data.

## Privacy & security

Windows Security can be accessed through the **Privacy & security** section of Windows Settings.

A key section of the Windows Security page is called *Protection areas*, which monitors four important areas:

1. Virus & threat protection
2. Account protection
3. Firewall & network protection
4. App & browser control
5. Device security

## Protection area status icons

Each one of the noted areas, within the Protection areas section, will typically have one of three different status icons which provide a quick but clear visual report about that security area.

### Interpreting the icons

- Green: means that our device is sufficiently protected, and there aren't any recommended actions.
- Yellow: means that there is a safety recommendation for us to review.
- Red: is a warning that something needs our immediate attention.

## Virus & threat protection

This section is divided into two parts:

1. Current threats
2. Virus & threat protection settings

## Current threats

### Scan options

| Scan Option | Description |
|--------|---------|
|Quick scan|Checks areas of the system where malware is most likely to be found. It is designed to complete relatively quickly.|
|Full scan|Checks all files and running programs on the device. Due to it checking a much larger number of items, it can take significantly longer to complete.|
|Custom scan|Allows us to choose a specific file, folder, or location to scan.|
| Microsoft Defender Antivirus (offline scan) | Restarts the computer and runs Microsoft Defender in a separate environment outside the normal Windows operating system. To be clear, 'offline' doesn't mean without an internet connection, just outside the Windows environment. This allows Defender to scan for malware that may be difficult to detect or remove while Windows is running. After the scan finishes, the computer restarts and loads Windows normally. |

### Protection history

Microsoft describes this section of Virus & threat protection as the place where Windows Security shows actions taken by Microsoft Defender Antivirus, potentially unwanted apps that were removed, and certain security services that are disabled.

Protection history retains events for **two weeks**. Common entries include:

| Entry | Description |
|--------|---------|
|Threat found - action needed|Defender has detected a possible threat and is awaiting our decision on how to proceed.|
|Threat quarantined|The threat has been blocked and placed into quarantine.|
|Threat blocked|Defender has blocked and removed the threat.|
| Remediation incomplete | Defender attempted to deal with a threat but was incapable of completely resolving it. |
| Potentially unwanted app | Potentially unwanted software was detected.|
| This app has been blocked | Windows Security has prevented an application from running because it has been identified as potentially unsafe or untrusted. For example, Microsoft Defender SmartScreen may block an application and display a message such as "Windows protected your PC".|

## Virus & threat protection settings

This section contains settings for configuring Microsoft Defender Antivirus, including features such as:

- Real-time protection
- Cloud-delivered protection
- Automatic sample submission
- Tamper protection

| Feature | Description |
|--------|---------|
|Real-time protection|Continuously monitors files and activity on our device to detect and block malware as it attempts to run or install.|
|Cloud-delivered protection|Uses Microsoft's cloud-based threat intelligence and analysis to help Microsoft Defender detect new and emerging threats more quickly.|
|Automatic sample submission|Allows Microsoft Defender to automatically send certain suspicious files or samples to Microsoft for analysis. This helps Microsoft identify and respond to new or previously unknown threats.|
|Controlled folder access | Helps protect files in specified folders from being modified or deleted by untrusted applications. Microsoft Defender automatically determines which applications are trusted, and additional applications can be allowed if necessary. |
|Exclusions | Allows specific files, folder, file types, or processes to be excluded from Microsoft Defender Antivirus scanning and, depending on the exclusion type, real-time protection. Exclusions can reduce false positives, but they also reduce protection and should only be used when necessary. |
|Notifications | Controls notifications from Windows Security, including notifications about detected threats, security actions, and other security-related events. |

## Virus & threat protection updates

This section allows us to check when **Microsoft Defender Antivirus security intelligence and other protection updates** were last installed and manually check for new updates. 

By keeping these updates current, we are helping Defender recognize the latest known threats.

## Ransomware protection

Finally, the last section of Virus & threat protection, contains features designed to protect files from ransomware, particularly **Controlled folder access**, which can prevent untrusted applications from changing files in protected folders. 

### What is Ransomware?

Ransomware is a type of malware that prevents a user from accessing their files, usually by encrypting them. Then demanding a ransom payment in exchange for supposedly restoring access.

## On-demand scans

We can perform on-demand scans on any file/folder using Microsoft Defender.

1. In file Explorer, right-click the file or folder.
2. Select *Show more options*.
3. Select *Scan with Microsoft Defender*.

Microsoft Defender will scan the selected item and display the results when the scan is complete.