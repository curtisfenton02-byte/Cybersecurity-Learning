class Student:

    def __init__(self, name, course):
        self.name = name
        self.course = course

    def __str__(self):
# __str__ is a dunder method which means to provide a 
# human-readable string representation of an object
        return self.name + " - " + self.course

student1 = Student("Sam", "Art")

print(student1)
# the str method has turned the return data into a String which
# print can then display

# without str, the output would be: 
# <__main__.Student object at 0x000001...>