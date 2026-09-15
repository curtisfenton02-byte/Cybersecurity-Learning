# Windows Registry Editor

The Windows Registry is a hierarchical database used to store information necessary to configure the system for one or more users, applications and hardware devices. 

The registry contains information that Windows references during operations, such as:

- Profiles for each user.
- Applications installed on the computer and the types of documents that each can create.
- Property sheet settings for folders and application icons.
- What hardware exists on the system.
- The ports that are being used.

To view/edit the registry, we can either, open the Registry Editor (`regedit`) which is the program used to view and modify the actual database. 

It is important to note that the Registry Editor is for advanced computer users as making changes can affect normal computer operations. Therefore, we may receive a User Account Control prompt when trying to access it.

## The Structure

The Registry Editor is divided into two main areas:

- Left side: keys
- Right side: values

### Left side

The left-hand side contains a tree structure of folders which are called **keys**. These folders can be expanded and collapsed to help navigate through the Registry.

They're conceptually similar to folders in File Explorer, although they are part of the Registry rather than the normal Windows file system.

### Right side

When we select a key, the right side shows the values stored inside that key.

### What is a key?

A key is a container for related Registry information. For example, if we expand **HKEY_LOCAL_MACHINE**, we might see:

- Software
- Microsoft
- Windows

In this case, these three are all keys. Keys can contain more keys and values.

### What is a value?

A **value** is an actual piece of configuration information stored inside a key. Each key contains different values which fit three different descriptions. These descriptions are:

1. Name: the name of the registry value.
2. Type: the format in which the data is stored.
3. Data: the actual information stored in that value.

## The five main sections of the Registry

At the top of the Registry Editor, we can see:

- HKEY_CLASSES_ROOT
- HKEY_CURRENT_USER
- HKEY_LOCAL_MACHINE
- HKEY_USERS
- HKEY_CURRENT_CONFIG

These are all called **root keys** or **registry hives**.

## HKEY_CURRENT_USER (HKCU)

This root key contains configuration information for the currently logged-in user. Typically, things such as user-specific application settings are stored here.

## HKEY_LOCAL_MACHINE (HKLM)

This other root key contains configuration information for the computer as a whole. Typically, machine-wide software and Windows configuration can be stored here.

### What do the data types mean?

Registry values aren't all stored in exactly the same format. Example format types include:

| Value Type | Description |
|----------|--------|
|REG_SZ|A normal text/string value.|
|REG_DWORD|A 32-bit numerical value. Most commonly used for settings that are effectively on/off or numeric.        |
|REG_QWORD|QWORD stands for Quad Word and stores a 64-bit integer (whole number).|
|REG_BINARY|Binary data rather than ordinary text.  |
|REG_MULTI_SZ|This is used to store multiple strings in a single Registry value. |


- REG_SZ: a normal text/string value.
- REG_DWORD: a 32-bit numerical value. Most commonly used for settings that are effectively on/off or numeric.
- REG_QWORD
- REG_BINARY: binary data rather than ordinary text.
- REG_MULTI_SZ

## Why does Windows use the Registry?

Windows uses the Registry as a persistent, hierarchical database for storing and retrieving configuration information used by Windows and applications. This allows settings and information about users, applications, hardware, file associations and other system configuration to be retained and accessed when required. 

