package PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileTask1 {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("Java-Learning/JavaBasics/resources/vehicle2.txt"));

String model = input.nextLine();
double mpg = input.nextDouble();
int tank = input.nextInt();
double price = input.nextDouble();

double gallons = tank / 4.54609;
double range = mpg * gallons;
double costToFill = (tank * price) / 100;

PrintWriter writer = new PrintWriter("Java-Learning/JavaBasics/resources/vehicle3.txt");

writer.println(model);
writer.println(costToFill);
writer.println(mpg + " " + tank + " " + price);
writer.println(range + " " + gallons);

writer.close();
input.close();
        
    }
}
