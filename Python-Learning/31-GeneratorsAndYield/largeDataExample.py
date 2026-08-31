# this function describes a generator which can provide 
# numbers 0 - 999999999, one at a time
def get_numbers():
    for number in range(1000000000):
        yield number

# creating the generator
numbers = get_numbers()

# requesting the values in order

# 0
print(next(numbers))

# 1
print(next(numbers))
