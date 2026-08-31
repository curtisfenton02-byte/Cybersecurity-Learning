try:
    number = int("hello")

except ValueError as error:
# ValueError is an exception object representing the error
    print(error)
# output: invalid literal for int() with base 10: 'hello'