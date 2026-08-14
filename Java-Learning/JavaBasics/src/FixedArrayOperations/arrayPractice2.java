package FixedArrayOperations;

public class arrayPractice2 {
    public static void main(String[] args) {
        int [] intArray = new int[5]; // array has 5 indexes
        for (int index = 0; index < intArray.length; index++){
            intArray[index] = index;
            System.out.println(intArray[index]);
        }
    }
}
