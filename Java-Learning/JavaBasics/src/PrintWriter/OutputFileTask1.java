package PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileTask1 {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("JavaBasics/resources/vehicle2.txt"));

String model = input.nextLine();
double mpg = input.nextDouble();
int tank = input.nextInt();
double price = input.nextDouble();

double gallons = tank / 4.54609;
double range = mpg * gallons;
double costToFill = (tank * price) / 100;

PrintWriter writer = new PrintWriter("JavaBasics/resources/vehicle3.txt");

writer.println(model);
writer.println(mpg + " " + tank + " " + price);
writer.println(range + " " + gallons);

writer.close();
input.close();
        
    }
}
