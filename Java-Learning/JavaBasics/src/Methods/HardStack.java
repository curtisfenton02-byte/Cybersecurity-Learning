package Methods;

public class HardStack {

    public static void main(String[] args) {
        methodA(3); // 1st main starts and calls method a
        System.out.println("DONE");
    }

    public static void methodA(int n) {
        System.out.println("A START"); // 2nd prints method a = a start

        methodB(n); // 3rd calls method b and keeps (3)

        System.out.println("A END"); // 9th print END
    }

    public static void methodB(int n) {
        System.out.println("B START"); // 4th prints method b (3) = b start

        for (int i = 0; i < n; i++) { // 5th runs loop inside method b three times
            System.out.println("B LOOP " + i); 
         /* B LOOP 0
            B LOOP 1
            B LOOP 2 */
        }

        methodC(); // 6th call method c (no more 3)

        System.out.println("B END"); // 8th print END
    }

    public static void methodC() {
        System.out.println("C"); // 7th print C
        // method c is now completed so back to method b
    }
}

