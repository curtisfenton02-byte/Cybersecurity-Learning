from datetime import timedelta, datetime

# this creates a timedelta
duration = timedelta(days=5)

print(duration)
# 5 days, 0:00:00

# adding timedelta to a date
today = datetime(2026, 8, 26)

future = today + timedelta(days=5)

print(future)