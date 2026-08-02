#length of a string
word = "python"
print(len(word))
#outputs number of characters (6) not number of indexes

#find
sentence = "i love python"
print(sentence.find("python"))
#prints at which index number the word python starts (7)
#index counts spaces

print(sentence.find("java"))
#if python can't find the text, it will print -1

#replace
speech = "i love python"

new_speech = speech.replace("python", "java")
#replaces old text (python), with new text (java)
print(new_speech)

print(speech)
#original text remains unchanged as strings are immutable

#strip
name = " curtis fenton "
print(name.strip())
#removes spaces from beginning and end of string, not in-between 
#words