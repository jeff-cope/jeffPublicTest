import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.*;

public class FileSizeComparison {
    public static void main(String[] args){
        
        String userPathTxt = "";
        String userPathWord = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of text file >> ");
        userPathTxt = input.nextLine();
        System.out.println("Enter name of Word file >>");
        userPathWord = input.nextLine();
        
        Path textFile = Paths.get(userPathTxt);
        Path wordFile = Paths.get(userPathWord);
        
        try{
            BasicFileAttributes attrText = Files.readAttributes(textFile, BasicFileAttributes.class);
            BasicFileAttributes attrWord = Files.readAttributes(wordFile, BasicFileAttributes.class);
            double textSize = attrText.size();
            double wordSize = attrWord.size();
            double ratio = (textSize / wordSize) * 100;
            
            System.out.println(textFile + " is "+ textSize + " bytes long");
            System.out.println(wordFile + " is " + wordSize + " bytes long");
            System.out.println("The text file is: " + ratio + "% of the Word file");
            
            
        }
        catch(IOException e){
            System.out.println(e);
           
        }
    
    }
    
}


/*Create a file that contains a line 
of your favorite song lyric. 
Use a text editor such as Notepad, 
and save the file. Copy the file contents, 
and paste them into a word-processing program 
such as Word. 
Write an application called FileSizeComparison 
that prompts the user for the names of the files 
and displays the sizes of the two files 
as well as the ratio of their sizes to each other.

The default file path for your project directory is
/home/nt-user/workspace/

Enter name of text file >> lyric.txt
Enter name of Word file >> lyric.docx
/home/nt-user/workspace/lyric.txt is 37 bytes long
/home/nt-user/workspace/lyric.docx is 11856 bytes long
The text file is 0.31207827260458837% of the size of the Word file

 homeWork jeffCope 
*/
