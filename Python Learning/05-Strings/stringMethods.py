name = "python programming"

print(name.upper())
#PYTHON PROGRAMMING
print(name.lower())
#python programming
print(name[0])
#p
print(name[-1])
#g

#note that npn of these methods are changing 'name' 
#but rather creating new strings of their own

#to permanently create a new string with these method changes
name = name.upper()
print(name)
#now 'name' is assigned to the new object (all uppercase)