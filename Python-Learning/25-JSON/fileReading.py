# in this file, we are going to be reading the students
# json file

import json

# this reads 
with open("Python Learning/25-JSON/students.json", 
          "r")as file:
    student = json.load(file)

print(student)

print(student["username"])