from collections import defaultdict

counts = defaultdict(int)
# int() produces 0, so a missing key automatically starts at 0

print(counts["failed"]) # 0