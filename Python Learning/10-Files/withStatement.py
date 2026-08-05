with open("Python Learning/10-Files/notes.txt", "r") as file:
    text = file.read()
#this reads and stores the file's information into 'text'
#no need for file.close as python does this for us

print(text)