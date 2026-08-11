class bankAccount:

    def __init__(self, balance):
        self.balance = balance

#creating a bankAccount object
account1 = bankAccount(100)

#this code outside the class can directly change an object's
# values
account1.balance = -5000

print(account1.balance)
#now account1's balance is -5000