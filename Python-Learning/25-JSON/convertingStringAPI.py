# example text received from an API 
response_text = '{"ip": "192.168.1.10", "status": "online"' \
', "ports": [22, 80, 443]}'

# I want to convert this text into a dictionary
import json

data = json.loads(response_text)

# now we can use this information however we want

print("IP:",data["ip"])
print("Status:", data["status"])

# comprehension
for port in data["ports"]:
    print("Open port:", port)


