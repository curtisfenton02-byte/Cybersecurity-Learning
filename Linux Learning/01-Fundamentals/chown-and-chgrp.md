### Users and Permissions Recap

Every file has:

- owner
- group 
- permissions

For example:

```bash
-rwxr-x--- 1 user1 developers script.sh
```
The above snippet tells us that:

1. The owner of the file is user1.
2. The group is the developers.
3. The permissions are `-rwxr-x---`

`chmod` changes the permissions but doesn't change the file's owner or group.

# Introducing Basic **chown** Syntax

The basic format for `chown` is:

```bash
chown USER FILE
```
## For example:

```bash 
chown alice notes.txt
```

The above command changes the owner of **notes.txt** to **alice**. It doesn't change the group or file permissions.

## Changing the owner and group together

`chown` can change both the owner and the group by using syntax such as:

```bash
chown USER:GROUP FILE
```

## For example:

```bash
chown alice:developers script.sh
```
Now alice is the owner and developers the group. The permissions remain unchanged.

## Why would we need to change ownership?

Having the ability to change the owner and group of a file becomes incredibly useful for managing a file which may be inaccessible to certain users or services due to it being created by someone else.  

For example, if a web server wanted to access a file located in another computer's `/var/www/`. An administrator could change the ownership of the file to match how the web-server is seen. Thus, the web-server is now the owner of the file and can access it.

However, due to the permissions remaining the same, the web-server will only be able to perform the same actions as the owner could.

# Changing only the group with chgrp

Linux contains a command specifically for changing a file's group called `chgrp`. This stands for **change group** and basic syntax would be:

```bash
chgrp GROUP FILE
```
### Example:

```bash
chgrp developers project.txt
```

As a result, the project.txt file's group has changed to developers.


