try:
    with open("Python Learning/10-Files/passwords.txt", "r") as file:
        data = file.read()
        print(data)



except FileNotFoundError:
    print("password file is missing")

print("program finished")