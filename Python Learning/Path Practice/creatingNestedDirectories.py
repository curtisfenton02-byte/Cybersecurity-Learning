from pathlib import Path

folder = Path("Python Learning/Path Practice/evidence/2026/august")

# parents=True creates any missing parent directories within
# Path Practice which are listed within the folder Path object
folder.mkdir(parents=True, exist_ok=True)
# creates:
#Path Practice
#└── evidence
#   └── 2026
#        └── august