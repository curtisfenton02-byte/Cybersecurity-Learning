package CharMethods;

import java.util.Scanner;

public class StringsTask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = console.next();

        System.out.println("Last name: ");
        String lastName = console.next();

        System.out.println("Full name: " + firstName + " " + lastName + " ");
        System.out.println("Initials: " + firstName.charAt(0) + lastName.charAt(0));
        System.out.println("First name is: " + firstName.length() + " characters");
        System.out.println("Last name is: " + lastName.length() + " characters");
    console.close();
    }
}
