# Lab-01 Challenge Questions and Answers

## 1

Q: Change the current working directory to /usr/bin.

A:

```shell
cd /usr/bin
```

## 2

Using TWO flags, list the fully entries of the contents of /usr/share, sorted by time/date order. 

First I need to find the two flags associated with the `ls` command which can:

1. Provide long list formatting.
2. Sort by modification time/date.

```shell
man ls
```

Found flags:

1. `-l`
2. `-t`

As these are both short flags, they can be combined, so full answer:

```shell
ls -lt /usr/share
```

## 3

Using ONE flag, make all `ls` output display in quotation marks.

```shell
ls -Q
```

## 4

Print the current working directory.

```shell
pwd
```

## 5

Change into home directory.

```shell
cd
```

## 6

Create a new directory called Copied Files.

```shell
mkdir "Copied Files"
```

## 7

Copy `/etc/issue` to our new Copied Files directory, calling it **copied_file**.

```shell
cp /etc/issue "Copied Files"/copied_file
```

## 8

Show the contents of the copied_file.

```shell
cat "Copied Files"/copied_file
```

## 9

Find the location for the `whoami` executable.

```shell
which whoami
```