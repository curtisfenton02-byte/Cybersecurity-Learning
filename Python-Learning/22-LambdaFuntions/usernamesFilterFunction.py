usernames = [
    "alice",
    "",
    "curtis",
    "",
    "admin"
]
# we want to remove empty usernames from this

# using a list function

valid_names = list(filter(lambda name: name != "",
                          usernames))

print(valid_names)
# ["alice", "curtis", "admin"]