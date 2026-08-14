package Methods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LoadingAFile {
    public static void main(String[] args) 
    throws FileNotFoundException{
        System.out.println(readFile("resources/test.txt"));
// calls the readFile method with the parameter "test.txt"
    }
    public static String readFile(String fileName) 
    // this method will return a String
    // Java now jumps to this method and copies "test.txt" into filename
    throws FileNotFoundException {
        String content = ""; //empty space to store String later
        FileReader file = new FileReader(fileName); // opens the file "test.txt"
        Scanner reader = new Scanner(file); // reads from the file
    while (reader.hasNext()) {
        content += reader.nextLine() + "\n"; // \n means newline
        // add next line of file onto the variable content
    }
    reader.close();
    return content; // returns file contents back to readFile and replaces "test.txt" with file contents
    }
}
