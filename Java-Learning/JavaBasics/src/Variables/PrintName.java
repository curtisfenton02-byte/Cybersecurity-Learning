package Variables;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PrintName {
    public static void main(String[] args) 
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("JavaBasics/resources/names.txt"));
        
        String name = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();


        System.out.println("Hello " + name);
         System.out.println("Hello " + name2);
         System.out.println("Hello " + name3);


        input.close();
    }

}
