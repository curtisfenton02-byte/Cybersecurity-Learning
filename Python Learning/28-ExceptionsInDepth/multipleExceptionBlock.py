try:
# here is two possible failures
    number = int(input("Enter a number: "))
    result = 100 / number

except ValueError:
# this handles inputs which aren't an integer
    print("You didn't enter a valid integer")

except ZeroDivisionError:
# this rejects the number 0 as an input
    print("You cannot divide by zero")