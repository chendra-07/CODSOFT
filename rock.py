import random

op = ["Rock", "Paper", "Scissors"]
user = input("Choose Rock, Paper, or Scissors: ")
computer = random.choice(op)

print("User's choice: ", user)
print("Computer's choice: ", computer)

if user == computer:
    print("It's a tie!")

elif user == "Rock" and computer == "Scissors":
    print("User wins!")

elif user == "Paper" and computer == "Rock":
    print("User wins!")

elif user == "Scissors" and computer == "Paper":
    print("User wins!")

else:
    print("Computer wins!")
