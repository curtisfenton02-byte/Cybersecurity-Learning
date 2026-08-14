package FileDebugging;

import java.io.File;
import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("resources/javaDebugging.txt");
        System.out.println("Working directory: " + System.getProperty("user.dir"));
        //checks where Java is looking
        
        System.out.println("Absolute path: " + file.getAbsolutePath());
        // checks the exact path Java constructed

        System.out.println("Exists? " + file.exists());
        // checks whether the file exists in specified location
    }
}
