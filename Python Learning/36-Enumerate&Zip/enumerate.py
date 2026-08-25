students = ["Alice", "Bob", "Curtis"]

# enumerate
for index, student in enumerate(students):
    print(index, student)

# by default, enumerate starts at index 0. However, we
# can change that:
for index, student in enumerate(students, start=1):
    print(index, student)
# now the output is:
# 1 Alice
# 2 Bob
# 3 Curtis
