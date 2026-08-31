class Score:

    def __init__(self, value):
        self.value = value

    def __str__(self):
        return "Score: " + str(self.value)
#str(...) converts the int value into a string so that it can
# be connected to "Score:" 

    def __eq__(self, other):
        return self.value == other.value
    
    def __add__(self, other):
# this method adds to objects together
        return Score(self.value + other.value)
#return Score creates a new score object containing the values
#of self and others. 

score1 = Score(50)
score2 = Score(30)

score3 = score1 + score2
#python effectively does result = score1.__add__(score2)

print(score1 + score2)
# output = 80

score4 = score3 + score1
print(score4)

print(score1)
# this triggers str() which prints score :, then followed by
# the value of the object being called, so 50

print(score1 == score2)


