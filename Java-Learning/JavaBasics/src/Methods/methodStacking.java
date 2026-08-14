package Methods;

public class methodStacking {

    public static void main(String[] args) { // 1st main starts
        methodA(); // 2nd call methodA
        System.out.println("END"); 
        // 11th return to main and print END
    }

    public static void methodA() {
        System.out.println("A1"); // 3rd print A1
        methodB(); // 4th call method b
        System.out.println("A2");
        // 10th return to method a and print a2
    }

    public static void methodB() {
        System.out.println("B1"); // 5th print b1   
        methodC(); // 6th call method c
        System.out.println("B2"); 
        // 9th return to method b as is next in line and print b2
    }

    public static void methodC() {
        System.out.println("C1"); // 7th print c1
        // 8th method c closes 
    }
}

