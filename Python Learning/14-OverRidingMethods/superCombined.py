class Animal:

    def __init__(self, name):
        self.name = name

    def introduce(self):
        return "My name is " + self.name

    def speak(self):
        return "Some animal sound"

class Dog(Animal):

    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed

    def speak(self):
        return super().speak() + " - woof"
# super connects the return from Animal's speak with Dog's speak

dog1 = Dog("buddy", "labrador")

print(dog1.introduce())
print(dog1.speak())
print(dog1.breed)