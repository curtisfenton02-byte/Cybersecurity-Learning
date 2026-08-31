from pathlib import Path

folder = Path("Python Learning/Path Practice/logs")

# rglob prints every .log file within the logs and archives 
# subdirectories
for file in folder.rglob("*.log"):
    print(file)

# Python Learning\Path Practice\logs\firewall.log
# Python Learning\Path Practice\logs\login.log
# Python Learning\Path Practice\logs\archive\old_login.log