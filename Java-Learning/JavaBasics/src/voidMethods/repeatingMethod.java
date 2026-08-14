package voidMethods;

import java.util.Scanner;

public class repeatingMethod {
    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a message: ");
        String message = console.nextLine();
        System.out.print("Enter a number of times: ");
        int times = console.nextInt();

    repeat(message, times);
// repeat a message a given number of times
    }
    public static void repeat(String message, int n){
        for (int i = 0; i < n; i++){
            System.out.println(message);
        }
    }
}
