package CounterControlledLoop;

import java.util.Scanner;

public class WhileChallenge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while (counter < 5) {
            System.out.println("Enter a number ");
            int number = console.nextInt();
            total = total + number;
            counter++;
            
        }
        System.out.println("Total = " + total);
        console.close();
    }
}
