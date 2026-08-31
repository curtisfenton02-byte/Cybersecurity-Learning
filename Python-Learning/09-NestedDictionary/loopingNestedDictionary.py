students = {
    "S001": {
        "name": "Curtis",
        "course": "Cyber Security"
    },

    "S002": {
        "name": "Alice",
        "course": "Computer Science"
    }
}
for student_id, details in students.items():
    print(student_id)
    print(details)
#prints all ids = SOO1 and 2
#prints names and courses for both dictionaries

for student_id, details in students.items():
    print(details["name"])
#loops through both ids and prints values stored in the name key

