numbers = [10, 20, 30]

iterator = iter(numbers)
# iter(numbers) creates an iterator from the list

print(next(iterator)) # 10
# this requests the next item in the list

print(next(iterator)) # 20
print(next(iterator)) # 30

print(next(iterator))
# now that there are no more items in the list, this raises
# StopIteration