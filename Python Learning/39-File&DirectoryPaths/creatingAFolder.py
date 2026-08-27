from pathlib import Path

folder = Path("logs")

# this creates a logs folder if one doesn't already exist
folder.mkdir()

folder.mkdir(exist_ok=True)

