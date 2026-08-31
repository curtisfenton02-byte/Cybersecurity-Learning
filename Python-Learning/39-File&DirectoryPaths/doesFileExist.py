# importing the Path module from Pathlib
from pathlib import Path

# path is now a Path object and represents the location of
# data.txt 
path = Path("data.txt")

# this checks whether path.txt exists
print(path.exists())

# if yes then True

# if no then False