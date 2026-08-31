class User:

    def __init__(self, username):
# here the internal value is _username
        self._username = username
    

    @property
# the property itself doesn't store "Curtis" but rather provides 
# controlled access to self._username
    def username(self):
        return self._username

    @username.setter
# assigning a new username runs the setter
    def username(self, new_username):

        if len(new_username) >= 3:
            self._username = new_username
        else:
            print("Username is too short")


user1 = User("Curtis")
# this stores user1 _username = Curtis

print(user1.username)
#user1.username is the public-facing property but the actual 
#stored attribute is user1._username

user1.username = "CyberCurtis"

print(user1.username)

user1.username = "A"
# prints "Username is too short"

print(user1.username)