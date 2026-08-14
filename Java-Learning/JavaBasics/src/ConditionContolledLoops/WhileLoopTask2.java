package ConditionContolledLoops;

import java.util.Scanner;

public class WhileLoopTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        
        int count = 0;
    while (count < 6) {
        System.out.print("Enter exam marks: ");
        int mark = console.nextInt();
    String grade;
    if (mark < 50){
        grade = "D";
    } else if (mark < 60){
        grade = "C";
        totalC += 1;
    } else if (mark < 70){
        grade = "B";
        totalB += 1;
    } else{
        grade = "A";
        totalA++;
    }
 System.out.println("The grade is: " + grade);
 count++;
    }  
    System.out.println("Number of A grades: " + totalA);
    System.out.println("Number of B grades: " + totalB);
    System.out.println("Number of C grades: " + totalC);
    console.close();
    }   
}
