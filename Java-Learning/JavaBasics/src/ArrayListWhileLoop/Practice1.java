package ArrayListWhileLoop;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList <String> people = new ArrayList<String>();
        people.add("Ben");
        people.add(1, "Curtis");
        people.add(2, "Sean");
        int i = 0;
    while (i < people.size()) {
        System.out.println(i + " " + people.get(i));
        i++;
    }
    }
}
