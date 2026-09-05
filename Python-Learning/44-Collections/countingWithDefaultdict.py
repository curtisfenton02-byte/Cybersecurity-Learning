from collections import defaultdict

counts = defaultdict(int)

logs = ["failed", "login", "failed", "login", "failed"]

for item in logs:
    counts[item] += 1

print(counts)

