numbers = [1, 2, 3, 4, 5, 6]

# comprehension

even_numbers = [number for number in numbers if 
                number % 2 == 0]

# normal loop
# even_numbers = []

# for number in numbers:
#    if number % 2 == 0:
#        even_numbers.append(number)

print(even_numbers)