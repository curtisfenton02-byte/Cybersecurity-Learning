package SentinelControlled;
import java.util.Scanner;
public class SentinelControlTask2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        System.out.print("Enter exam marks or -1 to quit: ");
        
    int mark = console.nextInt();
    while (mark != -1) { // stops when user enters -1
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
 System.out.println("Enter student marks or quit: ");
 mark = console.nextInt();
    }  
    System.out.println("Number of A grades: " + totalA);
    System.out.println("Number of B grades: " + totalB);
    System.out.println("Number of C grades: " + totalC);
console.close();   
}   
    
}



