marks = [67, 55, 78, 72, 50]
#changing value at index 0
marks[0]=90
print(marks[0])

#adding another element
numbers = [1, 2, 3]
numbers.append(4)
#now there is a fourth space for a new item
print(numbers)


names = ["John, Sarah"]
names.append("Alex")

#removing an item
names.remove("Sarah")

#removing an index
names.pop(0)

#inserting an item into the list
names.insert(1, "Bob")
print(names)

#finding the length
print(len(names))

#looping through a list
for names in names:
    print(names)

#printing index
for i in range(len(marks)):
    print(marks[i])
