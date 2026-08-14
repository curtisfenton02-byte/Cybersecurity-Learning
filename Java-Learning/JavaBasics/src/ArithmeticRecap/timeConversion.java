package ArithmeticRecap;

public class timeConversion {
    public static void main(String[] args) {
        int seconds = 367;
        int minutes = seconds / 60;
        int remaining = seconds % 60;
        System.out.println("Minutes: " + minutes);
        System.out.println("Remaining seconds:" + remaining);
    }
}
