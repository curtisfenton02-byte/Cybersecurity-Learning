class animal:

    def speak(self):
        return "an animal sound"

class dog(animal):
    def speak(self):
        return "woof"

class cat(animal):
    def speak(self):
        return "meow"

pet1 = animal()
dog1 = dog()
cat1 = cat()

print(pet1.speak())
print(dog1.speak())
print(cat1.speak())