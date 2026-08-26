numbers = [2, 4, 6, 7]

# all() checks whether all the numbers are Even
result = all(number % 2 == 0 for number in numbers)

print(result)
# False