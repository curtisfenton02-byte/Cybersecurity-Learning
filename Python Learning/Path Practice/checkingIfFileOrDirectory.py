from pathlib import Path

file_path = Path("Python Learning/Path Practice/test.txt")
folder_path = Path("Python Learning/Path Practice/logs")

# checks if test.txt is a file
print(file_path.is_file())

# checks if test.txt is a directory
print(file_path.is_dir())

# checks if logs is a file
print(folder_path.is_file())

# checks if logs is a directory
print(folder_path.is_dir())
