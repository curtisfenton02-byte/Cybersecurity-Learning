package FixedArrayOperations;

import java.util.ArrayList;

public class arrayPractice3 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
         number.add(1);
        number.add(2);
        number.add(3);
        number.add(7);
        number.add(100);
       // number.remove(2); 
        number.remove(Integer.valueOf(100));
        // number 7 is now in index 2 instead of 3
   System.out.println(number.get(number.size()-1)); 
   System.out.println(number.size());
   
   System.out.println(number.get(2)); 
   if (number.contains(2)) {
    System.out.println("Number 2 is in the list");
} 
  if (number.isEmpty()){
    System.out.println("The list is empty");
  }
    }
}
