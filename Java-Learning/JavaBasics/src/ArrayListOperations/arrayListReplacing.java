package ArrayListOperations;

import java.util.ArrayList;

public class arrayListReplacing {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");      

        names.set(1, "Ben"); 
        // sets Ben to element 1
        System.out.println(names);
    }
}
