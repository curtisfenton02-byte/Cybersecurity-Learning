package NestedFixedArrays;

public class intArrayTask3 {
    public static void main(String[] args) {
        int average = 0;
        int sum = 0;
        int[] intArray = {23, 6, 47, 35};
        for (int index = 0; index < intArray.length; index++){
            sum += intArray[index];
          
        }
          if (intArray.length != 0){
                average = sum / intArray.length;
            }
        System.out.println(average);
    }
}
