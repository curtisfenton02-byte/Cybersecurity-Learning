class BankAccount:

    def __init__(self, balance):
        self._balance = balance 

    @property
# treats the method below as a property
    def balance(self):
            return self._balance

    @balance.setter
    def balance(self, amount):
         if amount >= 0:
              self._balance = amount

account1 = BankAccount(100)

print(account1.balance)
# even without the () at the end, we still request the method
# balance(), not the attribute 'balance'

account1.balance = -500
#this will not change the balance as the setter rejects it
print(account1.balance)

account1.balance = 200
print(account1.balance)

