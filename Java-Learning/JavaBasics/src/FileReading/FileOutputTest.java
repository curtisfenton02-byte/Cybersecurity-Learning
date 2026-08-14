package FileReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class FileOutputTest {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("JavaBasics/resources/vehicle.txt"));

        PrintWriter output = new PrintWriter("JavaBasics/resources/output.txt");
        String name = input.nextLine();
        double mpg = input.nextDouble();
        int fuel = input.nextInt();
        double perLitre = input.nextDouble();
        
        double fuelCapacityGallons = fuel / 4.54609;
        double range = mpg * fuelCapacityGallons;
        double costToFill = (fuel * perLitre)/100;

        System.out.printf("Vehicle %s holds %d litres of fuel at a cost of %.1f p/litre.%n", name, fuel, perLitre);
        System.out.printf("On average, it returns %.1f mpg.%n", mpg);
        System.out.printf("It will cost £%.2f to fuel the vehicle %n", costToFill);
        System.out.printf("On average, this will give the vehicle a range of %.1f miles.%n", range);
        output.println(name + mpg + fuel + perLitre);
        
        
        input.close();
        output.close();

        
    }
}
