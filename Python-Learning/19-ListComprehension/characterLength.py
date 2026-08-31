names = ["Alice", "Bob", "Charlie"]

# original loop 

# for name in names:
# lengths.append(len(name))

# comprehension

lengths = [len(name) for name in names]

print(lengths)
# 5, 3, 7