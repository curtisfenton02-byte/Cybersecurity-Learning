try:
    number = int("hello")
# this is a ValueError

except Exception:
# this except handles all types of except errors including
# ValueError
    print("something has gone wrong")

except ValueError:
# this except will not run as the python tackles excepts
# from top to bottom, meaning the block above covers it
    print("invalid number")