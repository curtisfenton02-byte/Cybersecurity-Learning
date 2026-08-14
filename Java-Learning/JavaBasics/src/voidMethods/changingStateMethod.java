package voidMethods;

public class changingStateMethod {
    public static int count = 0;
    // initially the count = 0
    public static void increaseCount(){
        count++;
        // inside this method, count + 1 = 1
    }
    public static void main(String[] args) {
        System.out.println(count);
        // line 1 prints the intial count = 0 
        
        increaseCount();
        //next line jumps to increaseCount method
        
        System.out.println(count);
        // after count increases to 1, java returns to main
        // and prints the count which is now 1
    }
}
