try:
    number = int(user_input)
except:
# this is bad practice because it catches everything 
# without knowing what the problem is.
    print("Something went wrong")