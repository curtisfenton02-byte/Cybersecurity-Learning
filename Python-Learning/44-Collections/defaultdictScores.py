from collections import defaultdict

scores = defaultdict(int)
# scores is a dictionary-like object so it prints with {}

scores["Alice"] += 10
scores["Alice"] += 5
scores["Bob"] += 20

print(scores)
# defaultdict(<class 'int'>, {'Alice': 15, 'Bob': 20})

print(scores["Charlie"])
# 0

print(scores)
#defaultdict(<class 'int'>, {'Alice': 15, 'Bob': 20, 'Charlie': 0})