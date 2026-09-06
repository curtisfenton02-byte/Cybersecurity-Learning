from dataclasses import dataclass


# a dataclass is a simpler way of creating a class which would
# be mainly used to structure data, such as:
# class Student:
#    def __init__(self, name, age, course):
#        self.name = name
#        self.age = age
#        self.course = course

@dataclass
class Student:
    name: str
    age: int
    course: str

student = Student("Bob", 25, "Art")

print(student)
print(student.name)
print(student.age)
print(student.course)