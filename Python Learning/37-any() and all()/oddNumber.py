numbers = [2, 4, 6, 7]


# any() asks if there is at least one odd number
result = any(number % 2 != 0 for number in numbers)

print(result)
# True

