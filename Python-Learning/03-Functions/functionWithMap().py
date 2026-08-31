numbers = [1, 2, 3, 4]

# double function
def double(number):
    return number * 2
# but this only affects one number, not the entire list


# now we give this function to map so that it applies to
# each number in the list

# map()

# result = map(double, numbers)
# this gives map, the double function and the numbers
# list

# + list()

result = list(map(double, numbers))
# list turns the map object into a new list which can be
# printed

print(result)
# [2, 4, 6, 8]