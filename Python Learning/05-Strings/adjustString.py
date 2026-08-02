#strings cannot be changed directly
word = "python"
#word[0] = "j" would not work

#instead we have to create a new string and add the alterations
word = "j" + word[1:]
#now word = jython
print(word)