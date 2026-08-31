class BankAccount:

    def __init__(self, balance):
        self._balance = balance

    def deposit(self, amount):
# method which rejects invalid inputs
        if amount > 0:
            self._balance += amount

    def get_balance(self):
        return self._balance

   

account1 = BankAccount(100)

# intended way to change the balance, as it uses the class method
account1.deposit(50)

print(account1.get_balance())
# prints 150 


