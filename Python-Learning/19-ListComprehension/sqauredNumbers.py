numbers = [1, 2, 3, 4, 5]

# original loop

# for number in numbers:
# squares.append(number * number)


# comprehension for loop
squares = [number * number for number in numbers]

print(squares)
