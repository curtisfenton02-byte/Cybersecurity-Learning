package FileReading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WagesCalculator {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("Java-Learning/JavaBasics/resources/task3.txt"));
        Scanner console = new Scanner(System.in);
        System.out.println("\n===== WAGES CALCULATOR =====\n");
        System.out.println("Enter the bonus rate as a percentage.");
        System.out.println("For example, enter 10 for 10% bonus.");
        System.out.println("Specify bonus rate: ");
        int bonusRate = console.nextInt();
        double totalWages = 0;
    while (file.hasNext()) {
        String name = file.next();
        int hours = file.nextInt();
        double hourlyRate = file.nextDouble();
        boolean bonus = file.nextBoolean();
        double wage = hours * hourlyRate;
    if (bonus){
        double bonusPay = bonusRate * hours * hourlyRate / 100;
        wage += bonusPay;
    }
    System.out.printf("%s worked %d hours at a rate of £%.2f per hour and received £%.2f %n", name, hours, hourlyRate, wage);
    totalWages += wage;
       
    System.out.println(); //spacing 

    System.out.printf("Total wages paid: £%.2f\n", totalWages);
    }
    
    
    file.close();
    console.close();
    }
}
