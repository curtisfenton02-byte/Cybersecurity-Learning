import random
#this line imports Python's random module into memory

number = random.randint(1, 10)
#this tells python to go to the 'random' module and inside that
#module, find the function 'randint'
#(1, 10) calls the function

print(number)
#prints a random number

print(random.randint(1, 6))
#prints another random number between 1 and 6