package FixedArrayOperations;

public class intArrayTask1 {
    public static void main(String[] args) {
        int[] intArray = {21, 33, 57, 17, 9};
        intArray[1] = 3;
        intArray[4] = intArray[2] + intArray[3];
        System.out.println(intArray[1]);
        System.out.println(intArray[4]);
    }
}
