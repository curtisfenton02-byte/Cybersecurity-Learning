from datetime import datetime, timedelta

login_time = datetime.now()

current_time = datetime.now()

if current_time - login_time > timedelta(minutes=30):
    print("Session expired")
