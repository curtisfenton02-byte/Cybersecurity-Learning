def withdraw(balance, amount):

    if amount < 0:
# amount is less than 0, so True
        raise ValueError("Amount cannot be negative")

    return balance - amount


try:
# exception travels back to caller (here)
    result = withdraw(100, -20)

except ValueError as error:
# this handles exception
    print(error)
# output: Amount cannot be negative