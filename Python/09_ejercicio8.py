import random

number = random.randint(0,10)

guess= int(input("I am thinking about a number. can you guess it?"))
while True:
    if guess == number:
        break
    else:
        guess = int(input("Nope. Try again:"))
print("you guessed it. i was thinking about", number)
