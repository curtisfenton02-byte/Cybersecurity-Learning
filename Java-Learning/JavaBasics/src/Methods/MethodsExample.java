package Methods;

public class MethodsExample {
    public static void printToScreen (int inputValue){
        System.out.printf("The value is: %d", inputValue);
    }
    public static void main(String[] args) {
        int testValue = 123;
        printToScreen(testValue);
    }
}
