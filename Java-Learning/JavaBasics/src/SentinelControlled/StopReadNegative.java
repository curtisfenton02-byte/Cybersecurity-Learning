package SentinelControlled;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StopReadNegative {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/mixedValues.txt"));
        while (file.hasNextInt()){
            int number = file.nextInt();
        if (number < 0){
            break;
        }
        System.out.println(number);
        }
        file.close();
    }
}
