package NestedForLoop;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
    int max = 0;
    int count = 0;
    int num;
    for (int i = 0; i < 10; i++){
            num = console.nextInt();
    if (num < 0){
        break; // stop program
    }
    if (num > max){
        max = num;
    }
    count++;
}
        System.out.println("You entered " + count + " numbers, largest number = " + max);
        console.close();
    }

}
