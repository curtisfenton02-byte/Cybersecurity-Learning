# dictionary
students = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 20},
    {"name": "Charlie", "age": 23}
]

# sort student's age function

def get_age(student):
    return student["age"]

sorted_students = sorted(students, key = get_age)

print(sorted_students)

