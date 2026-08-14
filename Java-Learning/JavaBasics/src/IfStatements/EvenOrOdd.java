package IfStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();

    if (number % 2 == 0){ // % operator gives the remainder when dividing
        System.out.println(number + " is even ");
    }
    else{
        System.out.println(number + " is odd ");
    }
    console.close();
    }
}
