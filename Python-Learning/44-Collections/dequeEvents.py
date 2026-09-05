from collections import deque

events = deque(["login", "download", "logout"])

events.appendleft("connection")
# add to the left

events.append("disconnect")
# add to the right

events.popleft()
# remove from left

events.pop()
# remove from right

print(events)