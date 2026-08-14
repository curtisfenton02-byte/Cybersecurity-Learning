package StringMethods;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = console.next();
    if (name.equals("Fred")){
// name.equals is used to compare objects like Strings

        System.out.println("Welcome " + name);
  }
console.close();
    }
}
