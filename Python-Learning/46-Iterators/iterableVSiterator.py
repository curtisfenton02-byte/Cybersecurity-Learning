# a list is iterable but it is not itself an iterator
numbers = [1, 2, 3]

# this does not function because (numbers) is not an iterator
print(next(numbers))

# Instead:
iterator = iter(numbers)

# this works
print(next(iterator)) # 1