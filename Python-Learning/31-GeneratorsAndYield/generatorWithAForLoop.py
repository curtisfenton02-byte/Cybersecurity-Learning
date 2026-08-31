def get_numbers():
    yield 1
    yield 2
    yield 3

# this loops through each yield within the generator
for number in get_numbers():
    print(number)

