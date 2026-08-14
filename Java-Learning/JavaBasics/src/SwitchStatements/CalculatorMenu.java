package SwitchStatements;

import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1 - Add");
System.out.println("2 - Subtract");
System.out.println("3 - Multiply");
System.out.println("4 - Divide");
System.out.print("Choose an option: ");
        int option = console.nextInt();
    switch (option) {
        case 1:
            System.out.println("Addition ");
            
            break;
        case 2:
            System.out.println("Subtraction ");
            break;
        case 3:
            System.out.println("Multiplication ");
            break;
        case 4:
            System.out.println("Division ");
            break;

        default:
            System.out.println("Error. Incorrect input ");
            break;
    } 
    console.close();
    }
    
}
