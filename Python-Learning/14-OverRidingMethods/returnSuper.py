class Animal:

    def speak(self):
        return "some animal sound"

class Dog(Animal):

    def speak(self):
        return super().speak() + " - Woof"

dog1 = Dog()

print(dog1.speak())