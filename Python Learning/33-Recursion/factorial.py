# A factorial is: 5! = 5 × 4 × 3 × 2 × 1

# we can define this recursively
def factorial(number):

    if number == 1:
        return 1

    return number * factorial(number - 1)

print(factorial(5))
