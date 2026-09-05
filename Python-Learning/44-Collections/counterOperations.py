from collections import Counter

a = Counter(["login", "login", "logout"])
b = Counter(["login", "login", "login", "failed"])

print(a + b)
# adds the counts for matching keys

print(a & b)
# finds counts which appear within both counters