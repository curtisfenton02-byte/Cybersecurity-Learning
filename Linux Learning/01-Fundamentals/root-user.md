# The Root User

Linux has two different types of user accounts:

- root user
- regular user

The difference between these, is their system privileges. A regular user on a Linux system will be deliberately restricted in what they can do. For example, they can often times only:

1. create files in their home directory
2. run programs
3. install some software if given permission
4. modify their own files

However, **Root user** is a special administrative Linux user account which has less restrictions and can therefore:

1. read/modify almost any file
2. delete files belonging to other users
3. create and delete user accounts
4. install and remove system software
5. change system settings
6. start and stop system services

As a result, root is often described as having superuser privileges.

## Why doesn't everyone just use root?

The reason not every user account is a root, is because this would be extremely dangerous and unsafe for the system as a whole. As any user could then accidentally permanently delete or change something they didn't mean to.

Plus, from a security perspective, this would be a nightmare because now if a user gets hacked or catches malware from another source, the attacker would get the user's permissions. Effectively having unrestricted control over the entire Linux system.

Therefore, the overall rule is to give a user or program only the permissions it actually needs.

## Sudo

`sudo` is a command which tells Linux to run commands with elevated privileges.

An example use case for `sudo` would be when installing software which a normal user may not have permission to install because it affects the entire system. Therefore, instead of:

`apt install` ...

We can run:

`sudo apt install` ...

Now Linux checks whether your account is allowed to use `sudo` and if it is, Linux will give this `apt install` command **temporary** elevated privilege. Thus allowing it to be performed.

Keep in mind that this `sudo` state is temporary and does not permanently turn your account into root.

To check if your account has root privileges use:

`sudo -v`

If this command accepts your user password without an error, it means you can use root access via `sudo`.

The need for the user to confirm their password is an additional security check for sudo.

## sudo and the sudo Group

Linux can have a group called `sudo`, where its members can often use `sudo` for administrative commands based upon the system's `sudo` configuration.

Check your groups with:

```bash
groups
```
If within the list of group names there is `sudo`, it means your account could potentially request administrative privileges.

