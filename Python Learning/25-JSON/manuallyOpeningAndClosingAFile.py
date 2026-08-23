# manually opening, using and then closing a file can be
# dangerous if we encounter any errors during the process
file = open("file.txt", "r")

# using the file
try:
    data = file.read()
# this error means that file.close() will never run
    result = 10/0

# we can ensure that file.close does run by using finally
finally:
    file.close()