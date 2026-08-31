# *args allows a function to accept any number of 
# positional arguments
def add_all(*args):
    print(args)

# for example:
add_all(1, 2, 3, 4)

# or even:
# add_all(10, 20, 30, 40, 50)