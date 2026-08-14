package SentinelControlled;

import java.util.Scanner;

public class SentinelControlledLoop1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number ");
        int number = console.nextInt();
        while (number != 0) { 
            // repeat whilst the number entered is not 0
            sum = sum + number;
            System.out.println("Enter another number ");
            number = console.nextInt();
            
        }
        System.out.println("Total = " + sum);
        console.close();
    }
}
