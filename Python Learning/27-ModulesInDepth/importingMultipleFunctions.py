#here I am importing multiple functions from calculator.py
from calculator import add, subtract

# another method is to import the entire module
# import calculator

# then call the functions directly
# calculator.add()
# calculator.subtract() 

result1 = add(5, 3)
result2 = subtract(4, 2)

print(result1)
print(result2)