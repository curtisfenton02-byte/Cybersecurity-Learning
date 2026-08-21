try:
    number = int("hello")

except ValueError:
    print("Invalid number")

finally:
# this always runs whether an exception occurred or not 
    print("Finished")