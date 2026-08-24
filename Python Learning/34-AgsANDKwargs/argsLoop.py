def add_all(*args):
# args becomes a tuple containing all the positional
# arguments - add_all(10, 20, 30)


    total = 0

# looping through each number in the tuple
    for number in args:
# adding each number together and storing it in total
        total += number

    return total

print(add_all(10, 20, 30))
# output = 60