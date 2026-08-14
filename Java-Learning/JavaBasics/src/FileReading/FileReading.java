package FileReading;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args) 
        throws FileNotFoundException{
            FileReader file = new FileReader("JavaBasics/resources/pay.txt");
            Scanner read = new Scanner(file);

            String name = read.next();
            double rate = read.nextDouble();
            int hours = read.nextInt();

            double pay = rate * hours;

            System.out.printf("Employee: %s%n", name);
            System.out.printf("Pay: £%.2f%n", pay);

            read.close();
        }
    }

