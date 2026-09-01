# def add(a, b):
#   return a + b

# type hint
def add(a:int, b: int):
# a and b are expected to be integers
    return a + b

# this still works because python doesn't enforce a to be an int
print(add("Hello ", "Curtis"))

