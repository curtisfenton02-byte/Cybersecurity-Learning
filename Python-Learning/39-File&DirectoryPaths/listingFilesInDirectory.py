from pathlib import Path

folder = Path("logs")

# python loops through and lists all files within a 
# directory
for item in folder.iterdir():
    print(item)