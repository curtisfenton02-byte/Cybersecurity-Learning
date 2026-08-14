 package voidMethods;

import java.util.ArrayList;

class removeSmallestMethod {
    public static void removeSmallest(ArrayList<Integer> numbers){
        if (numbers.isEmpty()) {
            return;
        }
        int smallestIndex = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < numbers.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        numbers.remove(smallestIndex);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);
    }
}