from pathlib import Path

evidence = Path("Evidence")

for item in evidence.rglob("*"):

    if item.is_file():
        print(item)

