names = ["Alice", "Bob", "Curtis"]

ages = [25, 20]

for name, age in zip(names, ages):
    print(name, age)
# this only prints:
# Alice 25
# Bob 20

# Not Curtis, because zip() stops when the shortest
# iterable runs out, which in this case is 'ages'.