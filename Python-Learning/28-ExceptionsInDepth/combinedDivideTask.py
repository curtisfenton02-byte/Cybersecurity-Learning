def divide(a, b):
# divide() stops because of the caught error
    if b == 0:
        raise ValueError("Cannot divide by zero")
# this exception travels back to the caller 'try'
    return a / b


try:
    result = divide(10, 0)
# because b == 0, the ValueError() is raised

except ValueError as error:
# this handles the returned exception
    print(error)

else:
# else does not run because of the error
    print("Result:", result)

finally:
# finally always runs no matter what
    print("Finished")