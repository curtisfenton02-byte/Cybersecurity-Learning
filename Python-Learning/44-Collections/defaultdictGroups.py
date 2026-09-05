from collections import defaultdict

groups = defaultdict(list)
# list is telling defaultdict that any missing keys should be
# placed inside an empty list []

groups["admins"].append("Alice")
groups["admins"].append("Bob")
groups["users"].append("Charlie")

print(groups["admins"])
# ['Alice', 'Bob']

print(groups["guests"])
# Python creates: groups["guests"] = []
# and then returns the empty list []
