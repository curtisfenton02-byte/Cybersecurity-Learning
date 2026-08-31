from datetime import datetime

# string date
date_text = "26/08/2026"

# conversion to datetime
date = datetime.strptime(date_text, "%d/%m/%Y")

print(date)