numbers = [1, 2, 3, 4, 5, 6]

# normal loop

#for number in numbers:
#   if number % 2 == 0:
#        even_numbers.append(number)

# comprehension

even_numbers = [number for number in numbers if number % 2 == 0]


print(even_numbers)
# 2, 4, 6