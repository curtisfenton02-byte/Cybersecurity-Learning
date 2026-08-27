from pathlib import Path

# creating a Path object which represents the location of
# test.txt
path = Path("Python Learning/Path Practice/test.txt")

path2 = Path("does_not_exist.txt")

print(path)

# the type output varies, depending on the operating system
# in this case I am on Windows so it will be WindowsPath
print(type(path))

print(path.exists())
# because test.txt exists in the same folder as main.py
# the result is True

print(path2.exists())
# False

# this prints the current working directory
print("current directory:", Path.cwd())
# Current directory: C:\Cybersecurity-Learning


# this checks the exact file location Python is checking
print(Path("test.txt").resolve())
# C:\Cybersecurity-Learning\test.txt