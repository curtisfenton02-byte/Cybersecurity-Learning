package NestedFixedArrays;

public class trueArrays {
    public static void main(String[] args) {
        boolean[] passed = {true, false, true};
        int count = 0;
        for (int index = 0; index < passed.length; index++){
            if (passed[index]){
                count++;
            }
        }
        System.out.println(count);
    }
}
