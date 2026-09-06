class MyContext:
    def __enter__(self):
# this runs when we enter the with block
        print("Entering")

    def __exit__(self, exc_type, exc_value, traceback):
# this runs when we leave the block
        print("Leaving")

with MyContext():
    print("Inside")

# Entering
# Inside
# Leaving