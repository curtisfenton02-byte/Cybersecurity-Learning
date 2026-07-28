#What is the Linux File System?
The Linux file system is the way in which Linux organizers files and directories on a computer. Unlike Windows, where storage is divided into drives like C:\, D:\, etc. Linux uses one unified directory tree that starts from the root directory (/).
#Directory Structure
-What is a directory?
A directory is Linux’s name for a folder. The directory can contain files and other directories (called subdirectories). Linux organizes them all in a hierarchy called a tree structure. For example:
/ - everything starts from the root directory (/)
| - home – a directory which contains all user’s home directories 
	|-user – a personal home directory 
		|- notes.txt – inside the curtis folder is the file notes.txt
The full path is: /home/curtis/notes.txt
#What is a Root Directory?
The root directory is the top-level directory in Linux and is represented by /. Every file and folder exists somewhere underneath /.
#Why is the Root Directory Important in Cybersecurity?
The root directory contains:
- system configuration files
- user accounts 
- application files
- logs
- security settings
These are all important information stored on a device making it a necessity for a cybersecurity professional to understand how to navigate the root directory and access this information.
#Absolute vs Relative Paths
An absolute path shows the complete location starting from /. For example:
- /home/user/Documents/file.txt
This always points to the same location.
On the other hand, a relative path starts from your current location. For example, if you’re currently inside:
- /home/user
You can access Documents using:
- Documents/file.txt
instead of:
/home/user/Documents/file.txt
#Home Directory(/home)
The /home directory contains the personal directories for your everyday users. For example:
/home
	|- person1
	|- person2
	|- person3
Each user gets their own folder. For example: /home/person1 is person1’s personal directory.
Within the home directory there will often be:
-Documents
-Downloads
-Pictures
-Projects
-Scripts
-Personal files
#Shortcut ~
Linux provides the ~ shortcut for your home directory. Allowing users to type cd on its own or cd ~ instead of the full path: cd /home/user
For cybersecurity professionals, the home directory is often where they will:
-store scripts
-download tools
-clone GitHub repositories
-create cybersecurity labs
An example could be: ~/tools/nmap-scripts

#System Configuration Files (/etc)
In Linux /etc contains configuration files for the operating system and applications. It does not contain program or personal files. /etc is often used for:
-system settings and rules
-user account information
-security configuration
Example paths:
/etc/passwd
contains information about user accounts.
/etc/shadow
contains encrypted password information and can only be accessed by privileged users.
/etc/ssh/
contains SSH server configuration.
Understanding /etc is important as attackers often target it because misconfigured settings can create vulnerabilities. As a result, security professionals often examine user permissions, authentication settings and network configurations to ensure device safety.

#Essential User Commands (/bin)
The /bin directory contains essential command-line programs needed for the system to function. Such programs include:
/bin/ls
/bin/cp
/bin/mv
/bin/cat
/bin/bash
Each of these commands allow users to interact with Linux. Typically, a user would type the command on its own, but Linux will run it from the /bin directory. For example, typing ls means that Linux will run /bin/ls.
Many security tools use command-line programs like /bin/bash are used by attackers in the Linux shell in an attempt to perform:
-bash exploitation
-command injection
-shell attacks

#Variable Data (/var)
The /var directory stores data which is constantly changing during the systems run time. For example:
-log files
-email in-boxes
-web application related files
-cron files
-MySQL databases
Logs are extremely important for:
-incident response
-digital forensics
-threat detection

#/var/run
/var can also store temporary service data. This would be running data stored by programs such as:
-caches
-queues
-job states
These can be accessed by entering the /var/run directory.
#var/spool
Spool data is also stored in /var/spool. This data often represents applications waiting to be processed like:
-print jobs
-email queues

#Professional Usage
Security analysts often investigate /var/log to understand:
-who accessed a system
-when an attack happened
-what commands were executed
For example, a suspicious login would appear in /var/log/auth.log
#Temporary Files - /tmp
The /tmp directory is short for temporary, and its purpose is to store files created by programs and users. Similar to RAM, /tmp it is volatile, meaning that once the computer is restarted, the contents of the folder can be cleared out. Therefore, /tmp is only useful as temporary storage.
/tmp is often abused by attackers because it grants many users and applications permission to access it. As a result, these attackers can use /tmp to:
-store malicious files
-hide temporary scripts
-execute attacks
On the other hand, /tmp is useful for pen-testing as once logged in, this directory can be used to house helpful tools for machine investigations. Using /tmp as opposed to other directories is useful because these other directories:
-may have strict permissions
-using them could break something 
-are more likely to be monitored as they hold permanent data
To investigate suspicious files, security professionals often check ls -la /tmp.
#User Programs and Resources - /usr
The /usr directory contains user applications and utilities. Despite the name, it does not mean user home folders.
Common /usr directories include:
-/usr/bin: this contains installed programs. For example, git, nmap and python3
/usr/share: contains shared files. For example, documentation, man pages and application resources.
#Professional Usage
Typically, security tools are often installed within /usr/bin. This knowledge helps professionals:
-locate tools
-understand installed software 
-investigate suspicious programs.




