package ArrayListIfStatement;

import java.util.ArrayList;

public class arrayListLab3 {
    public static void main(String[] args) {
        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("Fred");
        strArray.add("Alice");
        strArray.add("Bob");
    if (strArray.contains("Fred")){
        System.out.println("Found Fred ");
    }
    else{
        System.out.println("There is no Fred ");
    }
    }
}
