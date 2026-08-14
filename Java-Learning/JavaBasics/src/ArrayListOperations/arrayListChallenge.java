package ArrayListOperations;

import java.util.ArrayList;

public class arrayListChallenge {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(9);
        numbers.add(30);
        numbers.set(2, 50);
        numbers.remove(Integer.valueOf(7)); 
        // tells java to remove object 7 not index 7
       int size = numbers.size();
    System.out.println(numbers);
    System.out.println(numbers.get(0)); 
    // give me the first number
    System.out.println(numbers.get(numbers.size()-1)); 
// size() returns the number of elements in the list.
// Because indexing starts at 0, the last element is always at
// index size() - 1

    System.out.println(size);
    }
}
