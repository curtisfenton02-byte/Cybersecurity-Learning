numbers = [1, 2, 3, 4, 5, 6]

# the filter function checks whether the lambda logic
# returns True or False and only stores the True values
even_numbers = list(filter(lambda number: number % 2 == 0,
                           numbers))

print(even_numbers)
# [2, 4, 6]