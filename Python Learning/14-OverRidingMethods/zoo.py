class Animal:
# parent class
    def introduce(self):
        return "i am an animal"

class Dog(Animal):
# child class
    def introduce(self): 
# this method can override the previous one
        return "i am a dog"

# creating objects
animal1 = Dog()

# calling function
print(animal1.introduce())
# overrides animal class and prints dog's introduce method instead