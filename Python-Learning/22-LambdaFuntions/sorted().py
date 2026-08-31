students = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 20},
    {"name": "Charlie", "age": 23}
]
# we want to sort this data by age

# so we use a lambda sorted() function

sorted_students = sorted(students, key = 
# because students is a list, the first mention of student
# in the lambda refers to the whole:
# {"name": "Alice", "age": 25},
         lambda student: student["age"])
# Whilst student[age] refers to the specific numbers,
# like 25

print(sorted_students)