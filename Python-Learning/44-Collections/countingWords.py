from collections import Counter

text = "login failed login successful login failed"

# this allows the method to count words instead of characters
words = text.split()

counts = Counter(words)

print(counts)

Counter(text.split())
# Counter({'login': 3, 'failed': 2, 'successful': 1})

print(counts.most_common(2))
# [('login', 3), ('failed', 2)]