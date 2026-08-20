# here I will be writing to the blank student json file

import json

#creating the dictionary which will be converted to string
student = {
   "username": "Curtis",
    "age": 23,
    "course": "Cyber Security" 
}
# this converts the dictionary 
with open("Python Learning/25-JSON/students.json",
           "w") as file:
    json.dump(student, file)

#this prints to another file but I've added indent=4
with open ("Python Learning/25-JSON/blankStudents.json",
           "w") as file:
    json.dump(student, file, indent=4)
# indent=4 makes the JSON file easier to read

