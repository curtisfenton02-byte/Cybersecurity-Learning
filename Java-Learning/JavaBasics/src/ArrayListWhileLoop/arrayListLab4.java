package ArrayListWhileLoop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListLab4 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/lab4.txt")); // read numbers from file
        ArrayList<Integer> intArray = new ArrayList<>(); // create integer arrayList

        int sum = 0; // add sum for later calculations
        while (file.hasNextInt()) { // reading file
            int number = file.nextInt();
            intArray.add(number); // store numbers from file to arrayList
            sum += number;
        }
        double average = (double) sum / intArray.size(); // average is sum / size of list

        int smallest = intArray.get(0);
        int largest = intArray.get(0);
    for (int i = 1; i < intArray.size(); i++){
        int value = intArray.get(i);
    if (value < smallest){
        smallest = value;
    }
    if (value > largest){
        largest = value;
    }
    }
    System.out.println("Average: " + average);
    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);
file.close();        
}
        
    }

