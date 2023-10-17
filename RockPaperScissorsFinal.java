
import java.util.*;
public class RockPaperScissorsFinal {

    public static void main(String[] args) {
        System.out.println("This Is a Game of Rock, Paper Scissors ... Winner is best of 5"); 
        String[] comHandArray = {"R","P","S"};
        String comHand = "";
        String thisWinner = "";
        int index = 0;
        int timesPlayerWon = 0;
        int timesComWon = 0;
        String gameWinner = "";
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.println("What's your hand player? Rock, Paper or Scissors ?");
            String myHand1stLetter = input.nextLine();
            String myHand = myHand1stLetter.substring(0,1);
            myHand = myHand.toUpperCase();
            index = (int)(Math.random() * 10 ) % 3;
            comHand = comHandArray[index];
            thisWinner = theWinner(myHand, comHand);
            if(thisWinner.equals("Player")){
                timesPlayerWon++;
            }    
            else if (thisWinner.equals("Com")){
                timesComWon++;
            }
                               
        }
        if(timesPlayerWon == timesComWon){
            gameWinner = "Tie";
        }
        else if (timesPlayerWon < timesComWon){
            gameWinner = "Com";
        }
        else if (timesPlayerWon > timesComWon){
            gameWinner = "Player";
        }
        System.out.println("Times Player Won: " + timesPlayerWon);
        System.out.println("Times Com Won: " + timesComWon);
        System.out.println("The Game Winner is: " + gameWinner);
     
    }
    
    private static String theWinner(String myHand, String comHand){
        //this method returns the winner of one game of rock paper scissors
        String theWinner = "Tie";
        
        if(myHand.equals(comHand))
            theWinner = "Tie";
        else if (myHand.equals("R")){
            if (comHand.equals("P")){
                theWinner = "Com";
            }
            else if(comHand.equals("S")){
                theWinner = "Player";
            
            }
        
        }
        else if (myHand.equals("P")){
            if (comHand.equals("R")){
                theWinner = "Player";
            }
            else if (comHand.equals("S")){
                theWinner = "Com";
                
            }
        
        }
        else if (myHand.equals("S")){
            if(comHand.equals("P")){
                theWinner = "Player";
            }
            else if (comHand.equals("R")){
                theWinner = "Com";
            }
        }
         
        return theWinner;
        
    }
    
    
    
}
//jefcope may 19, 2023 A.D.    This program plays Rock, Paper, Scissors. Winner is best of 5...
