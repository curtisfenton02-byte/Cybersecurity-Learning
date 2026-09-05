from collections import Counter

text = "hello world"

letters = Counter(text)

print(letters)
# this counts every character within the string, including the space

print(letters["l"]) # 3

print(letters.most_common(3))
# [('l', 3), ('o', 2), ('h', 1)]