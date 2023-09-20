import java.util.Scanner;
public class FormLetterWriter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name >> ");
        String firstName = input.nextLine();
        System.out.print("Enter last name >> ");
        String lastName = input.nextLine();
        
        displaySalutation(firstName);
        displaySalutation(firstName,lastName);
    }
    
    static void displaySalutation(String fname){
        System.out.println("Dear " + fname + ",");
        System.out.println("Thank you for your recent order.");
    }
    
    static void displaySalutation(String fname,String lname){
        System.out.println("Dear " + fname + " "+ lname + ",");
        System.out.println("Thank you for your recent order.");
    
    }
        
    
}
    
    
    

