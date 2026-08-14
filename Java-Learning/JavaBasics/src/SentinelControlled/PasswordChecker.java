package SentinelControlled;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = console.next();
    while (!"java123".equals(password)) { 
        // while password isn't java123, repeat
        System.out.println("Incorrect password ");
        System.out.println("Try again: ");
         password = console.next();
        
    }
    System.out.println("Access Granted ");
    console.close();
    }
}
