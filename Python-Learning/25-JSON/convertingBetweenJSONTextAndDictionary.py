# importing Python's built-in JSON
import json

# student dictionary
student = {
    "username": "Curtis",
    "age": 23,
    "course": "Cyber Security"
}

# converting it into a JSON string
json_text = json.dumps(student)

print(json_text)

# reversing json text back into a dictionary

# json_text = '{"username": "Curtis", "age": 23}'

student = json.loads(json_text)

print(student["username"])