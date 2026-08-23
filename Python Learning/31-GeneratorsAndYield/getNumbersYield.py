# this is a generator function
def get_numbers():
    yield 1
    yield 2
    yield 3

numbers = get_numbers()

# prints the number 1 then pauses the generator
print(next(numbers))

# resumes the generator and prints 2 before pausing again
print(next(numbers))

# resumes again and prints 3, the generator is now finished 
print(next(numbers))

