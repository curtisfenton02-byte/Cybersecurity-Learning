package Methods;

public class StructureReuse {
    private static void line(){
        System.out.println("-------");
    }
public static void box(){ // method box reuses line()
    line();
    System.out.println("Welcome");
    line();
}
public static void main(String[] args) {
    box();
}
}
