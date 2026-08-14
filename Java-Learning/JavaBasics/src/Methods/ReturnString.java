package Methods;

public class ReturnString {
    public static void main(String[] args) {
        String person = fullname("John","Smith");
        System.out.println(person);
    }
    public static String fullname(String first, String last){
        return "John" + " Smith";
    }
}
