import json

student = {
    "name": "Curtis",
    "course": "Cyber Security",
    "skills": ["Python", "Java", "Linux"]
}

json_text = json.dumps(student)

print(json_text)
