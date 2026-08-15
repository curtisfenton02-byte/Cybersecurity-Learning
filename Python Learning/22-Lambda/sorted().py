students = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 20},
    {"name": "Charlie", "age": 23}
]
# we want to sort this data by age

# so we use a lambda sorted() function

sorted_students = sorted(students, key = 
                         lambda student: student["age"])

print(sorted_students)