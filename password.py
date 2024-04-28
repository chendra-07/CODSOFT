import string
import random

word = int(input("Enter the  length of the password: "))

print('''Choose the Type of password required to be generated from these :
		1. Letters
		2. Digits
		3. Special characters
		4. Exit''')

List = ""

while(True):
	ch = int(input("Enter your choice: "))
	if(ch == 1):
		List += string.ascii_letters

	elif(ch == 2):
		List += string.digits

	elif(ch == 3):
		List += string.punctuation

	elif(ch == 4):
		break
	else:
		print("Invalid choice!")

password = []

for i in range(word):
	randomchar = random.choice(List)
	password.append(randomchar)

print("The random password generated is: " + "".join(password))

