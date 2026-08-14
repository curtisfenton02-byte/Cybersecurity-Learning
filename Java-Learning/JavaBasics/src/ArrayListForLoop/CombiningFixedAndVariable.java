package ArrayListForLoop;

import java.util.ArrayList;

public class CombiningFixedAndVariable {
    public static void main(String[] args) {
        int[] fixedArray = {10, 20, 30}; // fixed array
        ArrayList<Integer> variableArray = new ArrayList<>();
        // creates an empty arrayList

    for (int i = 0; i < fixedArray.length; i++){
        // i < 3

        variableArray.add(fixedArray[i]);
        //cycles through each fixed array index from 0 - 2
        // ands adds each value into the arrayList
    }
    System.out.println(variableArray);
        System.out.println(variableArray.size());
    }
}
