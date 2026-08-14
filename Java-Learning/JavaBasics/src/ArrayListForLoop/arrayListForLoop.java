package ArrayListForLoop;

import java.util.ArrayList;

public class arrayListForLoop {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add(1,"Bob");
        names.add(2, "Charlie");
    for (int i = 0; i < names.size(); i++){ // for loop
        System.out.println(i + " " + names.get(i)); 
        // print indexes and names
    }
    }
}
