from collections import deque

events = deque(["A", "B", "C", "D"])

events.rotate(1)
# because 1 is a positive number, the items rotate to the right
# that many spaces

print(events)
# deque(['D', 'A', 'B', 'C'])

events.rotate(-2)
# negative numbers rotate to the left