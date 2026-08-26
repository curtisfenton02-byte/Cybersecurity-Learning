from datetime import datetime, timedelta

start = datetime(2026, 8, 26, 10, 30)
end = start + timedelta(hours=3)

print(end)
print(end - start)