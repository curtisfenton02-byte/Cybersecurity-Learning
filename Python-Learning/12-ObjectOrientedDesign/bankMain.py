from bankAccountData import bankAccount

account1 = bankAccount("alice", 100)

#account1.balance  = -500
#external factor affecting the internal classes' values

account1._balance(-500)

currentMoney = account1.getBalance()
print(currentMoney)

print(account1.balance)
print(account1._balance)

