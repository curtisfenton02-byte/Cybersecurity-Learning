package Methods;

public class ReturnBoolean {
    public static void main(String[] args) {
        boolean result = canVote(20);
        // if age is 20
        System.out.println(result);
        // returns true
    }
    public static boolean canVote(int age){
        return age >=18;
    // if age is greater than or equal to 18 return true
    }
}
