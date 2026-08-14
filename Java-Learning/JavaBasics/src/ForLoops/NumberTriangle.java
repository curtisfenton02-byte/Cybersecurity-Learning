package ForLoops;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int num = 1; num <= i; num++){
                System.out.print(i); // prints row number 
            }
            System.out.println();
        }
    }
}
