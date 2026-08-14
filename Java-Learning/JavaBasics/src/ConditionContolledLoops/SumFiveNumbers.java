package ConditionContolledLoops;

import java.util.Scanner;

public class SumFiveNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int total = 0;
        int count = 0;
    while (count < 5) {
        System.out.println("Enter a number: ");
    int number = console.nextInt();
    total += number;
    count ++;
 }
     System.out.println("Total = " + total);
console.close();
    }
}
