# this is a basic representation of how function calls work
def first():
# python starts at first() and adds it to the call stack
    second()
# then python adds second() on top of the call stack
# ┌──────────┐
# │ second() │ ← currently running
# ├──────────┤
# │ first()  │
# └──────────┘

def second():
# whilst running, second() prints Hello, then is removed
# from the stack
    print("Hello")

# ┌─────────┐
# │ first() │ ← running again
# └─────────┘

# since there is no code in first(), it finishes and the
# stack becomes empty

# this calls the first() function to start
first()