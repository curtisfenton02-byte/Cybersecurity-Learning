package FixedArrayOperations;

public class fillingArrayLoop {
    public static void main(String[] args) {
        int [] values = new int[10];
        for (int index = 0; index < values.length; index++){
            values[index] = index;
            System.out.println(values[index]);
        }
    }
}
