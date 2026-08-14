package ForLoops;

import java.util.Scanner;

public class ForLoopLargest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
      System.out.println("Enter 5 numbers: ");

        int max = 0; // adding max
        for (int count = 0; count < 5; count++){ // adding 5 and declaring no more than 5

            int number = console.nextInt(); 
            if (number > max){ //updates when new number is bigger than current max
                max = number; // new max is now highest number
            } 
        }
        System.out.println(max);
        console.close();
    }
}
