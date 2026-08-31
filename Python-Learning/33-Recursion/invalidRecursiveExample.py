# this is an example of a bad recursive call as having
# number + 1 as the base case, causes indefinite stacks
def forever(number):
    forever(number + 1)

forever(1)
# output: RecursionError: maximum recursion depth exceeded