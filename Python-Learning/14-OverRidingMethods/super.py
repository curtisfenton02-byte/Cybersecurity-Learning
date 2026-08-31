class Animal:

    def __init__(self, name):
        self.name = name

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
# super() calls the parent's init() method into the Dog class
        self.breed = breed


#creating dog object
dog1 = Dog("Buddy", "Labrador")

print(dog1.breed)

