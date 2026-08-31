# this imports the datetime class from the built-in
# datetime module
from datetime import datetime

# this stores the current date and time values 
current_time = datetime.now()

# this prints the entire values
print(current_time)

# this only prints the current year
print(current_time.year)

# month
print(current_time.month)

# day
print(current_time.day)

# hour
print(current_time.hour)

# microsecond
print(current_time.microsecond)