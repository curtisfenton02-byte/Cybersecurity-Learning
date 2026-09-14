# Volume Shadow Copy Service

The Volume Shadow Copy Service (VSS) is a Windows service and framework that allows applications to create a point-in-time copy, or snapshot, of a volume (storage area, such as C:) while Windows and applications continue running. 

The purpose of VSS is to allow backup and recovery software to obtain a consistent view of data without requiring applications to be completely stopped.

VSS coordinates three main components:

1. Requesters: applications that request a shadow copy, such as backup software. 
2. Writers

| Component | Description |
|----------|--------|
|Requesters|Applications that request a shadow copy, such as backup software.|
|Writers|Applications that prepare their data so that it can be captured consistently.|
|Providers|Components responsible for creating and maintaining the shadow copy.|

A shadow copy represents the state of a volume at a particular point in time. VSS uses this snapshot so that backup or recovery software can access a consistent version of the data whilst the normal volume continues to change.

Volume Shadow Copies are stored on the System Volume Information folder of each drive that has protection enabled.

If VSS is enabled (System Protection turned on), we can perform the following tasks from within **advanced system settings**:

- Create a restore point
- Perform system restore
- Configure restore settings
- Delete restore points

From a security perspective, malware writers know of this Windows feature and write code in their malware to look for these files and delete them. Doing so makes it impossible to recover from a ransomware attack unless we have an offline/off-site backup. 

