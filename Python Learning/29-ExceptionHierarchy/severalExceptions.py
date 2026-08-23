try:
    ...

except(ValueError, TypeError):
# depending on the type of error, python will choose one
# of these two except types to cover it
    print("invalid data")