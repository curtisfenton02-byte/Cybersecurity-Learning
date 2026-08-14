package FileReading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class CopyingFile {
    public static void main(String[] args) 
            throws FileNotFoundException {
                Scanner input = new Scanner(new File("JavaBasics/resources/source.txt"));
            PrintWriter output = new PrintWriter("JavaBasics/resources/copy.txt");

            while (input.hasNextLine()){
                output.println(input.nextLine());
            }
            input.close();
            output.close();
    }
}
