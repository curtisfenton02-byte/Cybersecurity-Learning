try:
    number = int("hello")
# try block is immediately stopped and except runs
except ValueError:
# this except handles a ValueError
    print("That wasn't a valid number")