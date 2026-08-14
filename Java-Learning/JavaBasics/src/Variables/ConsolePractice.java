package Variables;
import java.util.Scanner;
public class ConsolePractice {
     static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String name;

        System.out.println("Enter your name: ");
        name = console.nextLine();

        System.out.println("Hello " + name);

    }
}
