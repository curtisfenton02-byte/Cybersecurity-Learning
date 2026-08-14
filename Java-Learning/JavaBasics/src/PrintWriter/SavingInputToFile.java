package PrintWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SavingInputToFile {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        PrintWriter output = new PrintWriter("JavaBasics/resources/names.txt");
        
        output.println(name);

        output.close();
        keyboard.close();
    }
}
