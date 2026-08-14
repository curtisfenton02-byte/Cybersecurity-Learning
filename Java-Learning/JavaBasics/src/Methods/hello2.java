package Methods;

import java.util.Scanner;

public class hello2 {
    private static void helloName(String name){
        System.out.println("Hello " + name + "!");
        
 }
 public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = console.nextLine();

    helloName(name);
    console.close();

 }
}

