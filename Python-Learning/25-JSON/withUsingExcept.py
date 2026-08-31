try:

    with open("example.txt", "r") as file:
# in this case, example.txt doesn't exist so code block
# stops and no data is read.
        data = file.read()

except FileNotFoundError:
# the specific except type is FileNotFoundError so it is
# handled in this except block
    print("File does not exist")
# this is printed

else:
# else does not run
    print("File opened successfully")

# with would still be responsible for cleanup if the file
# was actually opened, which in this case it wasn't