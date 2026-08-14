package ArrayListOperations;
import java.util.ArrayList;
public class arrayListTask1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        String secondName = names.get(1);
        // gets name: Bob
    System.out.println(secondName);

    }
}
