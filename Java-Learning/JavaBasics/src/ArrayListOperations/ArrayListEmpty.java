package ArrayListOperations;

import java.util.ArrayList;

public class ArrayListEmpty {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        boolean empty = names.isEmpty(); // checks whether list is empty, if so prints true or false
        System.out.println(empty);
}
}
