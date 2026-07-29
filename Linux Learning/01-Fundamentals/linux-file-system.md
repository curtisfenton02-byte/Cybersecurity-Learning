# What is the Linux File System?

The Linux file system is the way in which Linux organizes files and directories on a computer.

Unlike Windows, where storage is divided into drives like `C:\`, `D:\`, etc., Linux uses one unified directory tree that starts from the root directory (`/`).

---

# Directory Structure

## What is a Directory?

A directory is Linux’s name for a folder.

The directory can contain:
- Files
- Other directories (called subdirectories)

Linux organizes them all in a hierarchy called a tree structure.

For example:

```text
/
├── home
│   └── curtis
│       └── notes.txt

# Variable Data (`/var`)

The `/var` directory stores data which is constantly changing during the system's runtime.

For example:

- Log files
- Email inboxes
- Web application-related files
- Cron files
- MySQL databases

Logs are extremely important for:

- Incident response
- Digital forensics
- Threat detection

---

# `/var/run`

`/var` can also store temporary service data.

This would be running data stored by programs such as:

- Caches
- Queues
- Job states

These can be accessed by entering the `/var/run` directory.

```text id="q9r1jm"
/var/run