numbers = [1, 2, 3, 4]

# comprehension

squares = {number: number * number for number in numbers}

# normal dictionary loop
squares = {}

for number in numbers:
    squares[number] = number * number