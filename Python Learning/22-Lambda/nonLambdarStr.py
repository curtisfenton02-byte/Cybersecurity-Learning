usernames = ["alice", "BOB", "Charlie"]
# I want to turn all these names to lowercase

# lambda version
lowercase = list(map(lambda username: username.lower(), 
                    usernames))

# using an existing built-in function - str.lower()
lowercase = list(map(str.lower, usernames))


print(lowercase)