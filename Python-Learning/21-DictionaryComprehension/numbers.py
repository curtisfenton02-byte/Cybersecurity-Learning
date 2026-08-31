numbers = [1, 2, 3, 4]

# normal dictionary loop

# for number in numbers:
#    squares[number] = number * number

# comprehension

squares = {number: number * number for number in numbers}
# squares each number in dictionary

print(squares)
# {1: 1, 2: 4, 3: 9, 4: 16}