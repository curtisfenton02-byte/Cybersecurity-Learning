class PasswordManager:

    def store_password(self):
        print("Password stored")


class User:

    def __init__(self, username):
        self.username = username
# self here is still user1
        self.password_manager = PasswordManager()
# python creates a separate PasswordManager object and stores a
# reference to it inside user1

    def save_password(self):
        print(self.username)
        self.password_manager.store_password()
#self.password_manager becomes user1.password_manager
#this gives us the PasswordManager object
#then we call store_password() on this object which takes
#us to the method


user1 = User("Curtis")

user1.save_password()