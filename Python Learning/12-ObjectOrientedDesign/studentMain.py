from studentData import Student
student1 = Student("Curtis", "Cyber Security")
student1.changeCourse("Computer Science")
student1.introduce()

Student.university = "university of liverpool"

print(student1.university)
#finds the university attribute in the student class