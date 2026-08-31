from pathlib import Path

folder = Path("logs")

for item in folder.iterdir():
    if item.is_file():
        print(item)