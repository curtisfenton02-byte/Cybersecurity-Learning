package voidMethods;

import java.util.ArrayList;

class addingNamesToArrayList {
    public static void main(String[] args) {
           ArrayList<String> names = new ArrayList<>();
    names.add("Curtis");
    names.add("Alice");
// current arraylist consists of curtis and alice
    addBob(names);
// calls addBob method
    System.out.println(names);
    // prints all names
    }
    public static void addBob(ArrayList<String> list){
        list.add("Bob");
        // adds bob to arraylist
    }
 
    
}