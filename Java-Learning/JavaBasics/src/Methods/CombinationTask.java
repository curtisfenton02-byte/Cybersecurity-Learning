package Methods;

import java.util.Scanner;

public class CombinationTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = console.nextDouble();

        System.out.print("Enter second number: ");
        double b = console.nextDouble();

        double answer = average(a,b);
        System.out.println(answer);
    console.close();
    }
    public static double average(double x, double y){
        return (x + y)/2;
    // adds both user inputs and then divides them 
    // by 2 for the average
    }
    
}
