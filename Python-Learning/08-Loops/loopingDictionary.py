student = {
    "name": "John",
    "age": 20,
    "course": "Art"
}

for key in student:
    print(key)
#loops through the dictionary and prints each key

for value in student.values():
    print(value)
#prints values instead of keys

for key, value in student.items():
    print(key, value)