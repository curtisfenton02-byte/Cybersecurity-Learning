package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFileTask1 {
    public static void main(String[] args) throws FileNotFoundException{  
    
    Scanner input = new Scanner(new File("JavaBasics/resources/vehicle2.txt"));

String model = input.nextLine();
double mpg = input.nextDouble();
int tank = input.nextInt();
double price = input.nextDouble();

System.out.println("Model: " + model);
System.out.println("MPG: " + mpg);
System.out.println("Tank: " + tank);
System.out.println("Price: " + price);
double gallons = tank / 4.54609;

double range = mpg * gallons;
double costToFill = (tank*price)/100;

System.out.printf("Vehicle %s has a range of %.1f miles%n", model, range);
System.out.printf("Cost: £%.2f%n", costToFill);
input.close();
    
}
}
