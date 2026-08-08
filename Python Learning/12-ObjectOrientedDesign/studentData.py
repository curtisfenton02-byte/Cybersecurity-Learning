class Student:

    university = "Liverpool John Moores University"

    def __init__(self, name, course):
        self.name = name
        self.course = course

    def introduce(self):
        print("My name is", self.name)
        print("I study", self.course)

    def changeCourse(self, newCourse):
        self.course = newCourse

