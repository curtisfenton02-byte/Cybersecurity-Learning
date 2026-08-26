from datetime import datetime

date1 = datetime(2026, 8, 26)
date2 = datetime(2026, 9, 1)

difference = date2 - date1

# this result is a timedelta 
print(difference)
# Output: 6 days, 0:00:00
# In other words, these two dates are 6 days apart.