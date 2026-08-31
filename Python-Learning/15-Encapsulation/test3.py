class bankAccount:

     def __init__(self, balance):
          self._balance = balance


     def withdraw (self, amount):
            if amount <= self._balance:
                self._balance -= amount
            else:
                print("insufficient funds")

account1 = bankAccount(100)

account1.withdraw(150)

