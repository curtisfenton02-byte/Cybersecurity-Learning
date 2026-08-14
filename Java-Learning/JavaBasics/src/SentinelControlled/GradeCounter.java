package SentinelControlled;

import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int passes = 0;
        System.out.println("Enter mark -1 to quit: ");
        int mark = console.nextInt();
    while (mark != -1) {
        if (mark >= 50){
            passes += 1;
        }
        System.out.println("Enter mark or -1 to quit: ");
        mark = console.nextInt();
        
    }
    System.out.println("Passes = " + passes);
console.close();    
}
}
