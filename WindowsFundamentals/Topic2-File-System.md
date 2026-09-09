# Windows File System

The file system used in modern versions of Windows is the New Technology File System or NTFS. This is known as a journaling file system because it records file system changes in a journel before making them on the computer's disk.

For example, if we were trying to save a document and the power went out, upon startup, NTFS checks its journal and remembers that it was in the process of saving our document but never finished. As a result, NTFS reports this information to Windows, allowing it to decide whether to finish the operation or roll it back.

Before NTFS, there was FAT16/32 (File Allocation Table) and HPFS(High-Performance File System). FAT partitions are still in use today, typically within USB devices and MicroSD cards but not on personal Windows computers/laptops or servers.

NTFS addresses many of the previous file system's limitations such as:

- Supporting files larger than 4GB
- Setting specific permissions on folders and files
- Adding folder and file compression
- Encrypting

## How to check the File System

We can check what file system our Windows machine is using by up opening our File Explorer program, clicking **This PC** and then right-clicking our **Local Disk** drive and selecting **Properties**. This will result in a pop-up windows containing information including the machine's file system type.

## NTFS Specific Features

Windows has volumes, which are the logical storage space that Windows can format with a file system and assign a driver letter such as C: or D:. NTFS is the file system used by Windows to organize this volume and with it, we can set permissions that grant or deny access to files and folders.

These permissions and how they apply to files and folders are listed below:

|Permission|How this applies to files|How this applies to folders|
|----|------|----|
|Read|Permits the viewing and listing of files and sub-folders.|Permits the viewing or accessing of the file's contents.|
|Write|Permits adding to files and sub-folders.|Permits writing to a file.|
|Read & Execute|Permits the viewing and listing of files and sub-folders. As well as the execution of files; inherited by files and folders.|Permits the viewing and access of the file's contents as well as execution of the file.|
|List Folder Contents|Permits the viewing and listing of files and sub-folders. As well as the execution of files; inherited by files and folders.|N/A|
|Modify|Permits the reading and writing of files and sub-folders. Plus it allows deletion of the folder.|Permits the reading and writing of the file. Plus the deletion of the file.|
|Full Control|Permits the reading, writing, changing, and deleting of the files and sub-folders.|Permits the reading, writing, changing and deleting of the file.|

### How to view the Permissions of a file or folder

1. Right-click the file or folder we want to check the permissions of.
2. Next from the **context menu**, select **Properties**.
3. Within Properties, click on the **Security** tab.
4. Then, located within the **Group or usernames** list, select the user, computer, or group who permissions we want to view.

## Alternate Data Streams (ADS)

Alternate Data Streams (ADS) is a file attribute specific to Windows NTFS (New Technology File System).

A data stream is the actual data stored within a file. For example, a text file which contained "Hello, this is my file." would have this text stored by NTFS in a data stream called $DATA. Every file has at least one data stream ($DATA), and NTFS allows us to attach additional data streams to the same file. These additional streams are called Alternate Data Streams (ADS). 

Even if there are two data streams attached to one file, Windows Explorer only shows us the file's normal/default stream, not the additional stream. Nor does the second stream appear as a second file within the folder.

However, there are third party executables which can be used to view the ADS. Plus PowerShell grants the ability to view ADS for files.

### Cybersecurity Relevance of ADS

Due to Explorer not displaying data stream information, ADS can be used as a way to store secretive information by hackers. Historically attackers and malware have used ADS for:

- Hiding additional data
- Concealing files or scripts
- Storing malicious content
- Evading casual inspection

Despite this, not all uses for ADS are malicious. For example, when we download a file from the internet, there are identifiers written to ADS which convey where the file was downloaded from.

