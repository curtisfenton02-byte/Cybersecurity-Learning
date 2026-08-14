package DoWhileStatements;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age;
    do{
        System.out.println("Enter age: ");
        age = console.nextInt();
    } while (age < 0 || age > 120);
    System.out.println("Age accepted ");
    console.close();
    }
}
