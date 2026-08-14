package CounterControlledLoop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountWordsInFile {
    public static void main(String[] args) 
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("JavaBasics/resources/wordcount.txt"));
        
        int count = 0;

        while (input.hasNext()){
            input.next();
            count++;
        }
        System.out.println("Words = " + count);

        input.close();
    }
}
