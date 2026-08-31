from pathlib import Path

# searches all directories and subdirectories for a 
# .log file
for file in Path("logs").rglob("*.log"):
    print(file)