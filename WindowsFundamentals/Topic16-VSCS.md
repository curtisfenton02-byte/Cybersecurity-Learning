# Volume Shadow Copy Service

The Volume Shadow Copy Service (VSS) is a Windows service and framework that allows applications to create a point-in-time copy, or snapshot, of a volume (storage area, such as C:) while Windows and applications continue running. 

The purpose of VSS is to allow backup and recovery software to obtain a consistent view of data without requiring applications to be completely stopped.

VSS coordinates three main components:

| Component | Description |
|----------|--------|
|Requesters|Applications that request a shadow copy, such as backup software.|
|Writers|Applications that prepare their data so that it can be captured consistently.|
|Providers|Components responsible for creating and maintaining the shadow copy.|

A shadow copy represents the state of a volume at a particular point in time. VSS uses this snapshot so that backup or recovery software can access a consistent version of the data whilst the normal volume continues to change.

## System Protection and restore points

One important use of VSS within Windows is **System Protection**.

System Protection creates **restores points**, which contain information about system files, installed applications, the Windows Registry and system settings. A restore point allows Windows to be returned to an earlier state if a change causes a problem.

### How to access System Protection

System Protection can be accessed by either:

1. Searching for *Create a restore point* in the Windows search engine.
   
Or:

2. Win + R

```cmd
systempropertiesprotection.exe
```

It can be used to:

- Create a restore point
- Configure how much disk space is available for restore points
- Restore Windows to an earlier restore point
- Delete existing restore points

System Protection is not the same thing as VSS itself. VSS is the underlying technology that can be used to create point-in-time copies, whilst System Protection is a Windows recovery feature that makes use of this technology.

## Security implications

Shadow copies and restore points can be useful when recovering from malware, corrupted software, failed updates or other problems.

However, attackers can also deliberately attempt to delete or interfere with recovery data. This is particularly relevant to ransomware because destroying available restore points can make it considerably harder for a victim to recover the system without paying the attacker.

As a result, shadow copies should not be considered a replacement for backups.

## Current Windows 11 recovery features

Modern Windows 11 also includes Point-in-time restore, which uses VSS-created points to help return a device to an earlier state.

Point-in-time restore differs from traditional System Restore. Microsoft described it as a newer recovery mechanism that can automatically create restore points at regular intervals and retain them for a limited period. The default retention period is up to **72 hours**.
