# function
def countdown(number):

# number = stopping condition
    if number == 0:
        return

# as long as number != 0, this print runs for every iteration
    print(number)

# this calls the function itself 
    countdown(number - 1)

countdown(3)
# 1st iteration = countdown(3)
# 2nd iteration = countdown(3) - 1 = countdown(2)
# 3rd iteration = countdown(2) - 1 = countdown(1)
# 4th iteration = countdown(1) - 1 = countdown(0)
# countdown(0) = stop calling function 