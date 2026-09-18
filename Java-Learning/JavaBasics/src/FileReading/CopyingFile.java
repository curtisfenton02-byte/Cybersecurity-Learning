package FileReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class CopyingFile {
    public static void main(String[] args) 
            throws FileNotFoundException {
Scanner input = new Scanner(new File("Java-Learning/JavaBasics/resources/source.txt"));
PrintWriter output = new PrintWriter("Java-Learning/JavaBasics/resources/copy.txt");

            while (input.hasNextLine()){
                output.println(input.nextLine());
            }
            input.close();
            output.close();
    }
}
