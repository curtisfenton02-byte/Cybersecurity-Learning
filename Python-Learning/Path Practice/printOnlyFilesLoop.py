from pathlib import Path

folder = Path("Python Learning/Path Practice/logs")

# loops through each item in logs but only prints the files
for item in folder.iterdir():
    if item.is_file():
        print(item)

# Python Learning\Path Practice\logs\firewall.log
# Python Learning\Path Practice\logs\login.log