import os

print(os.getcwd())
#these two lines above print the working directory where python
#is looking for the file

file = open("Python Learning/10-Files/notes.txt", "r")
#the working directory is C:\Cybersecurity-Learning so to move 
#to the file we want to read, we have to go into the python folder
#then into the 10-Files folder where the file is stored

contents = file.read()
#the text from notes.txt is stored as a string in contents

print(contents)


file.close()
#closes the file