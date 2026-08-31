# return example doesn't print anything after return
def test1():
    return 1
    print("Hello")

# yield example
def test():
    yield 1
    print("Hello")
    yield 2

# prints 1 not Hello
number = test1()
print(number)

# creating the generator for test()
generator = test()

# prints 1
print(next(generator))

# prints Hello
print(next(generator))

# prints 2
print(next(generator))
