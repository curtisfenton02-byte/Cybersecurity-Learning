package PrintWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class WriteDataToFile {
    public static void main(String[] args) 
            throws FileNotFoundException {
        
        PrintWriter output = new PrintWriter("JavaBasics/resources/WriteDataToFile.txt");
        output.println("Hello");
        output.println("Practice");

        output.close();

        }
    }

