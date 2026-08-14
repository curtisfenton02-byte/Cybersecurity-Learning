package Methods;

public class methodParameters {
    public static void greet(String name){
        System.out.println("Hello " + name); // works with any name
    }
    public static void main(String[] args) {
        greet("Bob"); // Hello Bob
        greet("Ben");
    }
}
