package FileReading;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;
public class StudentGrades {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("JavaBasics/resources/grades.txt"));
       
        while (input.hasNext()){
        String name = input.next();
        int grade = input.nextInt();
        
        double average = grade/4;
        System.out.printf("The average is %s");
    }

    }
    
}
