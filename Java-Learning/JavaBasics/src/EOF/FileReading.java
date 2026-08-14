package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/SimpleNumbers.txt"));
        while (file.hasNextInt()){
            int number = file.nextInt();
            System.out.println(number);
        }
        file.close();
    }
}
