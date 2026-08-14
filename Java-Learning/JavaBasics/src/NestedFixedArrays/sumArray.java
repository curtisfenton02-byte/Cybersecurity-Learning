package NestedFixedArrays;

public class sumArray {
    public static void main(String[] args) {
        double[] sales = {12.5, 18.0, 7.5};
        double sum = 0;
        double average = 0;
        for (int index = 0; index < sales.length; index++){
            sum += sales[index];
        }
        if (sales.length != 0){
            average = sum / sales.length;
        }
        System.out.println("Total is " + sum);
        System.out.printf("Average is " + average);
    }
}
