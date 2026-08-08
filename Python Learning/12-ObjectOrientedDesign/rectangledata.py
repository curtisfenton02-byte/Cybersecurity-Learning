class rectangle:

    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def resize(self, width, height):
        self.width = width
        self.height = height

rectangle1 = rectangle(5, 8)
#creates a rectangle object with values 5 and 8

rectangle2 = rectangle(3, 5)

rectangle1.resize(2, 4)
#resizes rectangle1

answer = rectangle1.area()
#calls the area() method to calculate 5 * 8 and return the value

answer2 = rectangle2.area()

print(answer)
# print value

print(answer2)