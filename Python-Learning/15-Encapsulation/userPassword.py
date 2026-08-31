class User:

    def __init__(self, username, password):
        self.username = username
        self._password = password

#controlled behavior
    def change_password(self, old_password, new_password):
        if old_password == self._password:
            self._password = new_password
            return True

        return False
#now the object itself decides whether the password should change
user1 = User("curtis123", "password")

#user1.change_password("wrong", "newpassword")
#this would fail

user1.change_password("correct", "newpassword")
#this would succeed

print(user1.change_password)