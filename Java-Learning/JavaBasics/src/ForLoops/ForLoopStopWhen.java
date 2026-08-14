package ForLoops;

import java.util.Scanner;

public class ForLoopStopWhen {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    for (int count = 0; count < 3; count++){
        System.out.println("Enter any number (negative numbers close program):");
        int number = console.nextInt();
        if (number < 0){ // breaks once -number is entered
            System.out.println("Program closed");
            break;
        }
    }
    console.close();
    }
}
