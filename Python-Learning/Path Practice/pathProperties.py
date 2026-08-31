from pathlib import Path

path = Path("Python Learning/Path Practice/logs/login.log")

# the final name of whatever the path points to
print(path.name)
# login.log

# the final name without its file extension (.log)
print(path.stem)
# login

# only the file extension
print(path.suffix)
# .log

# returns another Path object representing the directory 
# which contains the path
print(path.parent)
# Python Learning\Path Practice\logs

# performing further actions with the new parent Path object
print(path.parent.name)
# logs

# parent of Python Learning\Path Practice\logs
print(path.parent.parent)
# Python Learning\Path Practice

# combines the new parent directory with the other.log file
new_file = path.parent/"other.log"

print(new_file)
# Python Learning\Path Practice\logs\other.log

