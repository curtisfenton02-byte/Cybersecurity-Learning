from collections import deque

queue = deque(["Alice", "Bob", "Charlie"])

queue.append("David")
# this adds David to the right side of the queue

queue.popleft()
# this removes the item from the left of the queue: Alice

print(queue)
# deque(['Bob', 'Charlie', 'David'])

