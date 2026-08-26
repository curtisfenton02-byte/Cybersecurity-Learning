from datetime import datetime

# creates current date and time
now = datetime.now()

# formats now() values into d/m/y
formatted = now.strftime("%d/%m/%Y")

# example: 26/08/2026
print(formatted)

# combined date and time formatted
combined = now.strftime("%d/%m/%Y %H:%M:%S")
# 26/08/2026 18:05:32

# other common formatting codes:

fourDigitYear = now.strftime("%Y")
print(fourDigitYear) # 2026

twoDigitMonth = now.strftime("%m")
print(twoDigitMonth) # 08

twoDigitDay = now.strftime("%d")
print(twoDigitDay) # 26

# hours/24
hours = now.strftime("%H")
print(hours) # 19

minute = now.strftime("%M")
print(minute) # 12

second = now.strftime("%S")
print(second) # 32