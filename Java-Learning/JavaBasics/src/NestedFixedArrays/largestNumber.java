package NestedFixedArrays;

public class largestNumber {
    public static void main(String[] args) {
     int  [] scores = {45, 87, 23};
     int largest = scores[0];
     for (int index = 0; index < scores.length; index++){
        if (scores[index] > largest){
            largest = scores[index];
        }
     }
             System.out.println(largest);

    }
}
