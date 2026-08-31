def withdraw(balance, amount):
# even though python may except a negative amount, we
# might not want that for the program

    if amount < 0:
# if amount is a negative it will trigger the raise
        raise ValueError("Amount cannot be negative")

    if amount > balance:
# if amount is less than the balance it will trigger raise
        raise ValueError("Insufficient funds")

    return balance - amount