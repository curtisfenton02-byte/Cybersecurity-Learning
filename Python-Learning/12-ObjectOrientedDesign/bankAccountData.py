class bankAccount:

    def __init__ (self, owner, balance):
        self.owner = owner
        self._balance  = balance

    def deposit(self, amount):
        if amount > 0: # internal rules for method
            self._balance  = self._balance  + amount

    def getBalance(self):
        return self._balance 
