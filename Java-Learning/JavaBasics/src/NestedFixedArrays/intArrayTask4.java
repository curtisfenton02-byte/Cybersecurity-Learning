package NestedFixedArrays;
import java.util.Arrays;
public class intArrayTask4 {
    public static void main(String[] args) {
        int[] intArray = {23, 6, 47, 35, 2}; // task 3
        Arrays.sort(intArray); // Java's built in sorting tool
       int smallest = intArray[0]; // assume the first value is both the smallest and largest
       int largest = intArray[0];
    for (int index = 0; index < intArray.length; index++){
        if (intArray[index] > largest){ // if current number is bigger than biggest, update it
            largest = intArray[index];
        }
        if (intArray[index] < smallest){ // if number is smaller, update it
            smallest = intArray[index];
        }
        if (intArray[index] % 2 == 1){ // checks if it is odd as % means remainder and odd numbers leave 1 remainder
            System.out.print(intArray[index] + " ");
        }
    }
    System.out.println("\nSmallest is: " + smallest);
    System.out.println("Largest is: " + largest);


    }
}
