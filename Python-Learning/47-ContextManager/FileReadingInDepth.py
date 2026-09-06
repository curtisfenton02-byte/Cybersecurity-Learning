with open("Python-Learning/47-ContextManager/example.txt",
           "r") as file:
# the variable: file only exists for use within the 'with' block
    print(file.read())
# the resource is cleaned up afterwards

print(file.closed) # True