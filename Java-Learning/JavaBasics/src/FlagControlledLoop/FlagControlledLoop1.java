package FlagControlledLoop;

import java.util.Scanner;

public class FlagControlledLoop1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            System.out.println("Guess the number ");
            int guess = console.nextInt();
        if (guess == 15){
            System.out.println("Correct ");
            correct = true;
        }
        }
// Flag controls are often boolean flags which decide when to
//  finish the loop

        console.close();
    }
}
