package FileReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) 
    throws FileNotFoundException{
  Scanner input = new Scanner(new File("JavaBasics/resources/numbers.txt"));    
    int total = 0;

    while (input.hasNextInt()){
        total += input.nextInt();
    }
    System.out.println("Total = " + total);
    System.out.println("Average is " + (total/5));
    input.close();

    }
}
