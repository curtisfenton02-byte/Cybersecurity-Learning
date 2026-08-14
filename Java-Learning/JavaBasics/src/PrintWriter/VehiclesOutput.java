package PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class VehiclesOutput {
    public static void main(String[] args) 
        throws FileNotFoundException{
        Scanner input = new Scanner(new File("JavaBasics/resources/vehicle.txt"));

        String name = input.nextLine();
        double mpg = input.nextDouble();
        int fuel = input.nextInt();
        double perLitre = input.nextDouble();
        
        double fuelCapacityGallons = fuel / 4.54609;
        double range = mpg * fuelCapacityGallons;
        double costToFill = (fuel * perLitre)/100;
        
        PrintWriter output = new PrintWriter("JavaBasics/resources/output.txt");
        output.printf("Vehicle %s%n", name);
        output.printf("%.1f %d %.1f%n", mpg, fuel, perLitre);
        output.printf("%.1f %.2f%n", range, costToFill);

        output.close();
        input.close();

    }

}
