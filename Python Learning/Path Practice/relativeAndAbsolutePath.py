from pathlib import Path

path = Path("Python Learning/Path Practice/test.txt")

print("relative path:", path)

print("absolute path:", path.resolve())

print("exists:", path.exists())