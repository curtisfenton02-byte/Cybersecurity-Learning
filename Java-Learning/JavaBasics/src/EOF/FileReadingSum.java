package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadingSum {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("resources/sumNumbers.txt"));
        int sum = 0;
        while (file.hasNextInt()){
        int number = file.nextInt();
        sum += number;
    }
    System.out.println("Sum = " + sum);
    file.close();
}
}
