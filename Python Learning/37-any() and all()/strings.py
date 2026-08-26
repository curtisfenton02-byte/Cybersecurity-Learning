passwords = ["abc123", "password1", "securePassword"]

# is nay password longer than 12 seconds?
any(len(password) > 12 for password in passwords)

# are all passwords at least 8 characters?
all(len(password) >= 8 for password in passwords)