import java.util.*;
public class DisplaySortedLists {
    public static void main(String[] args){
        String entry;
        
        ArrayList<String>words = new ArrayList<String>();
        ArrayList<Integer>numbers = new ArrayList<Integer>();
    
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a word or quit to quit >> ");
        entry = input.nextLine();
        
        while(!entry.equals("quit")){
            words.add(entry);
            Collections.sort(words);
            display(words);
            System.out.print("\nEnter a word or quit to quit >> ");
            entry = input.nextLine();
        }
        
        int number;
        System.out.println("\nEnter a number or quit to quit >> ");
        entry = input.nextLine();
        while(!entry.equals("quit")){
            number = Integer.parseInt(entry);
            numbers.add(number);
            Collections.sort(numbers);
            display(numbers);
            System.out.println("\nEnter a number or quit to quit >> ");
            entry = input.nextLine();
        }
    
    }
    
    public static void display(ArrayList list){
        System.out.println("\nThe size of the list is " + list.size());
        for(int x=0; x<list.size();++x){
            System.out.println(list.get(x));
        }
    
    }
    
}

/*Write a program called DisplaySortedLists 
that creates two ArrayList objects
—one to hold String values 
and one to hold Integer values. 
Prompt the user for a word, 
and while the user does not enter the sentinel value quit, 
continue to add each entered word to the ArrayList, 
sort the list, 
pass the list to a display() method, 
and prompt for another word. 
After the user enters the sentinel value, 
prompt the user for an integer. 
While the user does not enter the sentinel value, 
continue to add each entered Integer to the ArrayList, 
sort the list, pass the list to the same display() method, 
and then prompt the user for another Integer.

The display() should display the list after each new addition.
jeffCope homeWork Nov 2023AD*/
