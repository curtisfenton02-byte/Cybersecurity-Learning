package FileReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEmployeeData {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("JavaBasics/resources/employees.txt"));

        while (input.hasNext()){
            String name = input.next();
            double rate = input.nextDouble();
            int hours = input.nextInt();

            double pay = rate * hours;

        System.out.printf("%s earned £%.2f%n", name, pay);
        }
        input.close();
    }

}
