from pathlib import Path

folder = Path("Python Learning/Path Practice/test_folder")

# creates test_folder within Path Practice folder
folder.mkdir()
# if the directory already exists, instead Python will
# display an error

# to create the folder and prevent the error, we can use:
folder.mkdir(exist_ok=True)
