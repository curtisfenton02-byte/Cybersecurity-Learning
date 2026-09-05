from collections import Counter
# I am importing the Counter module from Python's collection class

ports = [80, 443, 80, 22, 443, 80]
# I want to know how many times each port appears in this list

counts = Counter(ports)
# Counter is essentially a specialized dictionary for 
# counting how many times values occur

print(counts)
# Counter({80: 3, 443: 2, 22: 1})

print(counts[80]) # 3
# we can treat counts as a specialized dictionary object

print(counts.most_common(2))
# prints the two most common values

Counter({
    80: 3,
    443: 2,
    22: 1
})