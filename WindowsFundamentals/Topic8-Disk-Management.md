# Computer Management Interface - Disk Management

In this file, I am going to be dissecting the Disk Management terminal and explaining its terminology. I will specifically cover:

1. Physical disk
2. Partitions
3. Volumes
4. NTFS

## What is a disk?

A disk is the physical storage device of a computer. For example, a computer might have 1TB SSD. This is the actual physical piece of hardware containing the storage. 

## What is a Partition?

A partition is a section of a physical disk which has been separated from the rest of the disk. Suppose we have a 1TB disk, Windows might divide this space into two partitions each consisting of their own size (P1: 600GB, P2: 400GB). Even though the disk is still physically one SSD, Windows now treats the two partitions as separate sections.

### Why create Partitions?

There are several reasons as to why we Windows would create partitions:

| Reason | Use Case |
|----------|--------|
|Separating operating system data|We could have one partition for Windows and another for Personal files. This way, if Windows needs to be reinstalled, we could potentially keep our data on the second partition.|
|Recovery partitions|Windows computers commonly have small partitions used for recovery or other system functions.|
|Multiple operating systems|A disk can also be partitioned so that different operating systems occupy different areas. For example, Windows operates one and Linux another.|

## What is a Volume?

A volume is a section of storage that Windows can use as a logical storage area, generally after it has been formatted with a file system.

## NTFS

This is another important feature when dealing with Disk Management and ties into the previously discussed terms. Suppose we have 1TB SSD and we create a 600GB partition. Windows doesn't automatically start storing ordinary files into this partition.

Rather, we would need to **format** this storage with a file system such as **NTFS**.

## Full Data Storage Workflow

The complete process that Windows does is:

1. Physical disk
2. Create partition
3. Format it with NTFS
4. Windows has a usable volume
5. Assign drive letter
6. C:

# What is a Drive Letter?

The drive letter is essentially a convenient name Windows gives a volume so that users and programs can access it. Examples include:

- C:
- D:
- E:

If a Windows volume is assigned `C:`, then we would receive such paths as:

- C:\Users\user2
- C:\Windows
- C:\Program Files

The important concept is that C: isn't the physical disk itself but rather a drive letter referring to a particular volume.