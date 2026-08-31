from pathlib import Path

folder = Path("Python Learning/Path Practice/logs")

# recursively lists every file within the logs directory
# and its subdirectories (archive)
for item in folder.rglob("*"):
    if item.is_file():
# print individual information about each file
        print("Path:", item)
        print("Name:", item.name)
        print("Stem:", item.stem)
        print("suffix:", item.suffix)
        print("parent:", item.parent)
        print()
