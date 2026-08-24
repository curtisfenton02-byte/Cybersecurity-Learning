student = {
    "name": "Curtis",
    "age": 23
}

def introduce(name, age):
    print(name, age)

# unpacking
# ** takes the dictionary's key-value pairs and passes
# them as keyword arguments
introduce(**student)
# this represents: introduce(name="Curtis", age=23)

# output = Curtis 23

