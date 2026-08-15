# List
numbers = [1, 2, 3, 4, 5]

# normal function

# doubled = []

# for number in numbers:
#    doubled.append(number * 2)

# map()

doubled = list(map(lambda number: number * 2, numbers))

print(doubled)