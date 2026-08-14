package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test1 {
public static void main(String[] args) throws FileNotFoundException{
Scanner file = new Scanner(new FileReader("student.txt"));

String name = file.nextLine();
int age = file.nextInt();
file.nextLine();          // consume newline
String course = file.nextLine();

System.out.println(name);
System.out.println(age);
System.out.println(course);

file.close();
    }
}
