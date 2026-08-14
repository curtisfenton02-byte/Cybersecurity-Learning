package Methods;

public class hello {
    public static void sayHello(){
        System.out.println("hello");
        
    }
    private static void tripleHello(){
        sayHello();
        sayHello();
        sayHello();
        }
    public static void main(String[] args) {
        tripleHello();
    }
}
