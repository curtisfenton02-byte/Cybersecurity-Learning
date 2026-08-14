numbers = [1, 2, 3, 4, 5, 6]

even_numbers = []

for number in numbers:
    if number % 2 == 0:
# if number in loop = 0 when divided by 2 then True
        even_numbers.append(number)
# append means to add into list so add even numbers into
# even_numbers list

print(even_numbers)