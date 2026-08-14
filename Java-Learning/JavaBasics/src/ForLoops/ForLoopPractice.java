package ForLoops;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <5; i ++){
          System.out.println("Enter 5 numbers: ");

            int newNum = console.nextInt();
            sum += newNum;
        }
        int average = sum/5;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        console.close();
    }
}
