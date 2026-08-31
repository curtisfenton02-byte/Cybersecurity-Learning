from pathlib import Path

folder = Path("Python Learning/Path Practice/logs")

# loops through each file/folder within the logs directory
# and prints them
for item in folder.iterdir():
    print(item)

# Python Learning\Path Practice\logs\archive
# Python Learning\Path Practice\logs\firewall.log
# Python Learning\Path Practice\logs\login.log
