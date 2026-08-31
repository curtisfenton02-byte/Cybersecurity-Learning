numbers = [1, 2, 3, 4, 5, 6]

# filter()

even_numbers = filter(lambda number: number % 2 == 0,
    numbers
)
# at this moment there is a filter object with [2,4,6]

# map()
result = list(map(lambda number: number * 2, even_numbers))
