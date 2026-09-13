# Command Prompt

The command prompt (`cmd`) is a Windows tool which allows users to use commands to obtain information about the computer system.

## Simple Commands

### Hostname

This command will output the computer name.

```cmd
hostname
```

### whoami

This command will output the name of the logged-in user.

```cmd
whoami
```

## Troubleshooting Commands

### ipconfig

This commonly used command, will show the network address settings for the computer.

```cmd
ipconfig
```

## Help Manual

Each command will have a help manual which explains the expected syntax needed to execute the command properly. As well as, any additional parameters that can be added to the command to expand its execution.

The command used to retrieve the help manual is `/?`. An example use case would be:

```cmd
ipconfig /?
```

## Clearing the command prompt screen

```cmd
cls
```

## netstat

The next command is `netstat` which displays protocol statistics and current TCP/IP network connections.

```cmd
netstat
```

## Parameters

By using `/?`, we can see that the netstat command can be run alone or with *parameters*, such as `-a`, `-b`, `-e` and more.

Whenever any of the parameters are appended to the root command, the output changes.

## net

The `net` command is primarily used to manage network resources. This command supports *sub-commands*, which is a command that belongs to a larger command and provides a specific operation or function. For example:

```cmd
net help
```

This is asking the `net` command to provide help information. Then we can also add an **argument** to this sub-command which specifies the topic we need help with.

```cmd
net help user
```

Here we are requesting help information for the `user` part of the net command.

## Further Resources

[Link for comprehensive list of cmd commands](https://ss64.com/nt/)