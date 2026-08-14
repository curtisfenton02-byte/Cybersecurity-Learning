package Methods;

public class EvenorOd {
    public static void main(String[] args) {
        boolean answer = isEven(8);
        System.out.println(answer);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
// if number is divided by 2 and had 0 remainder, return true
    }
}
