
import java.util.*;
public class SqrtException {
    public static void main(String[] args)throws ArithmeticException{
        String num = "";
        int convNum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer >>");
        num = input.nextLine();
        try{
            convNum = Integer.parseInt(num);
        }
        catch(Exception e){
            System.out.println("error");
            convNum = 0;
        }
        try{
            if(convNum < 0){
                throw(new ArithmeticException());
            }
        }
        catch(ArithmeticException e){
            System.out.println("Can't take square root of a negative number...");
        }
        
        System.out.println(Math.sqrt(convNum));
        
    }
    
}
