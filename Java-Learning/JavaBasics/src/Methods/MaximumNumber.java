package Methods;

public class MaximumNumber {
    public static void main(String[] args) {
        int answer = largest(5,12);
        System.out.println(answer);
    }
    public static int largest(int a, int b){
        if (a > b) {
            return a;
        }
        else{
            return b;
    // returns which ever number is bigger a or b
        }
    }
}
