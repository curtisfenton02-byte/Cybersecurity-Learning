package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/words.txt"));
        int count = 0;
        while (file.hasNext()) {
            String word = file.next();
            count++;
        
    }
    System.out.println("Total words: " + count);
    file.close();
    }
}
