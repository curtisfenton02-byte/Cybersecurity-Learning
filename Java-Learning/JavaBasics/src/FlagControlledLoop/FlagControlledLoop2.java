package FlagControlledLoop;

import java.util.Scanner;

public class FlagControlledLoop2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean found = false;
        while (!found) {
            System.out.println("Guess the secret number ");
            int guess = console.nextInt();
        if (guess < 30){
            System.out.println("Too low ");

        }
        else if (guess > 30) {
            System.out.println("Too high ");
            
        }
        else {
            System.out.println("Correct ");//answer = 30
            found = true;
        }
            
        }
        console.close();
    }
}
