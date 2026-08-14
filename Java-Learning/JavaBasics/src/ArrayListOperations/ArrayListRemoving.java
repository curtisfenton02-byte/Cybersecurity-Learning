package ArrayListOperations;

import java.util.ArrayList;

public class ArrayListRemoving {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    names.remove("Bob"); 
    // removes Bob
    names.remove(1); 
    // removes Charlie (which is in element 1 after Bob is removed)
    System.out.println(names);
    }
}
