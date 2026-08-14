package StringMethods;

public class Practice5 {
    public static void main(String[] args) {
        String name = "Fred";
    for (int i = 0; i < name.length(); i++){
        char c = name.charAt(i);
        System.out.print(c);
    }
    System.out.println();
   
    System.out.println((char) ('a' + 2)); 
    System.out.println('a' + 10);
    }
}
