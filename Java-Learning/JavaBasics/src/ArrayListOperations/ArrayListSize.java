package ArrayListOperations;

import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");   
    int size = names.size(); // stores the list size in the varibale 'size'
    System.out.println(size);    
    }
}
