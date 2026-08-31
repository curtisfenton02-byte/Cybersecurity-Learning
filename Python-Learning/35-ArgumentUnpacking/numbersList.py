numbers = [1, 2, 3]

def add(a, b, c):
    return a + b + c

# unpacking the list
# * takes the items from the iterable and passes them as
# separate positional arguments
print(add(*numbers))
# this becomes: add(1, 2, 3)

# output = 6