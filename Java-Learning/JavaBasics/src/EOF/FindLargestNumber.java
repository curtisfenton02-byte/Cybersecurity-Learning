package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/SimpleNumbers.txt"));
    int max = 0;
    while (file.hasNextInt()){
        int number = file.nextInt();
    if (number > max){
        max = number;
    }
    }
    System.out.println("Max = " + max);
    file.close();
    }
}
