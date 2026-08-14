package EOF;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PrintNamesScores {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("resources/mixed1.txt"));
    while (file.hasNext()){
        String name = file.next(); // reads name
        file.next(); // reads scored
        int score = file.nextInt(); // reads number
    System.out.println(name + " scored " + score);
    }
    file.close();
    }
}
