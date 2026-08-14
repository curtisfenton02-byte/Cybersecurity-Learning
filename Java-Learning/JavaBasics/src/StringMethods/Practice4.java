package StringMethods;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Are you a doctor? ");
        String name = console.nextLine();
    if (name.startsWith("dr")) {
// if string starts with dr
        System.out.println("Can I have a sick-note?");
        
    } if (name.contains("herman")) {
        System.out.println("hi doctor herman");
// does the string contain the herman 
    } 
    else{
        System.out.println("Can I speak to a doctor?");
    }
    console.close();
    }
}
