def factorial(number):

    if number == 1:
        return 1

    return number * factorial(number - 1)

# calling the function
print(factorial(4))
# 4 != 1 so it skips the if statement. Then jumps to the
# last equation line, making it:
# return number(4) * factorial(4 - 1)
# the value 4 is returned and factorial(3) is now repeated
# through the function again:
# return number(3) * factorial(3 - 1)
# this is continued until we reach:
# return factorial(1), at which point the if statement
# becomes True, 1 is returned and the stack finishes

# now python works its way back through the stack:
# factorial(2) = 2 * factorial(1) = 2
# meaning that factorial(2) returns 2.

# factorial(3) * returned value (2) = 6
# meaning that factorial(3) returns 6.

# factorial(4) * returned value (6) = 24
# meaning that factorial(4) returns 24.

# final output = 24





