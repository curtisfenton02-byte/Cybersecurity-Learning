package FixedArrayOperations;

public class arrayPractice {
    public static void main(String[] args) {
        int [] intArray = {10, 20, 30, 4}; 
        // here I choose what goes into the array
        intArray [0] = 5;
        intArray [1] = 2 * intArray[0]; // array 1 = 10
        int thirdValue = intArray[2]; // array 2 = 30
        System.out.println("First value is " + intArray[0]);
        System.out.println("Second value is " + intArray[1]);
        System.out.println("Third value is " + thirdValue);
    }
}
