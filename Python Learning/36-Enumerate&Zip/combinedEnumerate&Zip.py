names = ["Alice", "Bob", "Curtis"]
ages = [25, 20, 23]

for index, (name, age) in enumerate(zip(names, ages), 
                                    start=1):
    print(index, name, age)