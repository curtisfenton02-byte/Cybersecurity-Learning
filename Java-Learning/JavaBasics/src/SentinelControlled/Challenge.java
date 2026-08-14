package SentinelControlled;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        int mark;
        System.out.println("Enter mark or -1 to quit: ");
        mark = console.nextInt();
    while (mark != -1) {
        do{
            if (mark != -1 && (mark < 0 || mark > 100)){
                System.out.println("Invalid mark. Enter 0-100 or -1 to quit: ");
                mark = console.nextInt();
            }
        } while(mark != -1 && (mark < 0 || mark > 100));
        if (mark != -1){
            if (mark >=70){
                totalA++;
            }
            else if (mark >= 60){
                totalB++;
            }
            else if (mark >= 50){
                totalC++;
            }
            }
            System.out.println("Enter mark or -1 to quit: ");
            mark = console.nextInt();
        }
        System.out.println("Number of A grades: " + totalA);
                System.out.println("Number of B grades: " + totalB);
                        System.out.println("Number of C grades: " + totalC);
                console.close();

        }
        
    }
    
