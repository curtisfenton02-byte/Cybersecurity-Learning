with open("Python Learning/10-Files/notes.txt", "w") as file:
  result = file.write("Cyber Security")
#writes Cyber Security to the notes.txt file and deletes any other
#words already in the file 

print(result)