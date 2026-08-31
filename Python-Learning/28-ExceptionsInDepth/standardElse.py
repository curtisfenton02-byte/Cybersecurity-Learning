try:
    number = int("50")

except ValueError:
    print("Invalid number")

else:
# this inly runs if the try block succeeds without exception
    print("Conversion succeeded")