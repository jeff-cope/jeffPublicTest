import random
import winsound
def main():
    print("This is a game of Rock, Paper, Scissors !")

    yourHand = int(input("Enter your hand: [1]Rock [2]Paper [3]Scissors  >> "))
    comHand = random.randint(1,3)
    theWinner = winner(yourHand, comHand)

    print()
    print("your hand is:", getNoun(yourHand))
    print("com hand is:", getNoun(comHand))
    if theWinner == "tie":
        print("it's a Tie game... there is no Winner")
    else:
        print("The", theWinner, "wins !!!")
    winsound.Beep(220, 500)
    print()

    playAgainCheck = input("PLA[Y] AGAI[N]?>>")
    if playAgainCheck.lower() == "y":
        main()
    else:
        print()
        print("GOODBYE PROFESSOR ...")

        winsound.Beep(440, 250)
        winsound.Beep(110, 250)

def winner(yourHand, comHand):
    winner = ""
    if yourHand == comHand:
         winner = "tie"

    elif yourHand == 1:
        if comHand == 2:
            winner = "Computer"
        else:
            winner = "Player"

    elif yourHand ==2:
        if comHand == 3:
            winner = "Computer"
        else:
            winner = "Player"

    else: #yourHand ==3:
        if comHand == 1:
            winner = "Computer"
        else:
            winner = "Player"

    return winner

def getNoun(num):
    noun = ""
    if num == 1:
        noun = "rock"
    elif num == 2:
        noun = "paper"
    elif num == 3:
        noun = "scissors"
    elif num == 4:
        noun = "lizard"
    elif num == 5:
        noun = "Spock"
    return noun

def countWinner(winner):
    pCount = 0
    comCount = 0
    tieCount = 0
    timesPlayed = 0
    if winner == "Player":
        pCount += 1
    elif winner == "Computer":
        comCount +=1
    else:
        tieCount +=1
    timesPlayed +=1
    return pCount, comCount, tieCount, timesPlayed

main()
