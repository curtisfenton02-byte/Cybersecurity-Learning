package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PrintAllWords {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("resources/words.txt"));
    while (file.hasNext()) {
        String word = file.next();
        System.out.println(word);
        System.out.println(System.getProperty("user.dir"));
    }
    file.close();
    }
}
