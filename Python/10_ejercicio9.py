import random
people=[]
for x in range(0,8):
    person=input("Type the name of a person:")
    people.append(person)

index = random.randint(0,7)

random_person = people[index]

print("Picking a random person: ", random_person)

print('--------------------------------------------------------------')

import random
colors = ["white","black","red","green","blue","yellow","purple","grey"]
while True:
    color = colors[random.randint(0,len(colors)-1)]
    guess= input("I am thinking about a color, can you guess it:")

    while True:
        if(color==guess.lower()):
            break
        else:
            guess = input("Nope. try again:")
    print("you guessed it! i was thinking about", color)

    play_again = input("Let´s play again? Type 'no' to quit.")
    
    if play_again.lower() == 'no':
        break
print("It was fun, thanks for playing!")
