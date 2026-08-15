def double(number):
    return number * 2

numbers = [1, 2, 3, 4, 5]

result = list(map(double, numbers))

print(result)