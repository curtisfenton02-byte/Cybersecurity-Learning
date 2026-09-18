package FileReading;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;
public class StudentGrades {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("Java-Learning/JavaBasics/resources/grades.txt"));
       
        while (input.hasNext()){
        String name = input.next();
        int grade = input.nextInt();
        
        double average = grade / 4.0;
        System.out.println("Student name: " + name);
        System.out.printf("The average is %.2f%n", average);

        
    }
input.close();
    }
    
}
