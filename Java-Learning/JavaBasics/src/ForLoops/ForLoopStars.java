package ForLoops;

import java.util.Scanner;

public class ForLoopStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of stars: ");
        int number = console.nextInt();
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
       console.close();
    }
}
