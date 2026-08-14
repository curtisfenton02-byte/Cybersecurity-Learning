package ArrayListOperations;

import java.util.ArrayList;

public class arrayListCheckingItem {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
    if (names.contains("Bob")){ 
        // checks whether arrayList contains Bob
        System.out.println("Found Bob ");
    }
    }
}
