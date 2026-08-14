package ArrayListForEachLoop;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
    for (String person : names){
        System.out.println(person);
    }
    }
}
