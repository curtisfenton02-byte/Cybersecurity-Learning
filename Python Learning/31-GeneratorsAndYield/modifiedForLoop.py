def get_numbers():
    for number in range(1000000000):
        yield number

# this creates a generator object
numbers = get_numbers()

# this for loop asks the generator for successive values
for number in numbers:
    print(number)

# then this break stops the loop
    if number == 4:
        break