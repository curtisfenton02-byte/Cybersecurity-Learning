try:
    file = open("data.txt")
    # work with file

finally:
# finally is important because even if there is an error,
# it will close the file
    file.close()