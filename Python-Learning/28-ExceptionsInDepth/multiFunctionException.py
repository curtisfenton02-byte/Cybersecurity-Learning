# this is called propagating or bubbling up an exception
def function_a():
    function_b()


def function_b():
    function_c()
# python travels through functions a/b/c before going
# backwards and stopping each function c/b/a. During
# which raise is passed through each function before
# returning to the try block and triggering except.

def function_c():
    raise ValueError("Something went wrong")


try:
    function_a()

except ValueError:
    print("Error caught")