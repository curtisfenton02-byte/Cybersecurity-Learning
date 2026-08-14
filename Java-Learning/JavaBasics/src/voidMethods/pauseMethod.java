package voidMethods;

import java.util.Scanner;

public class pauseMethod {
    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
// java runs from the main first
        System.out.println("I've finished a complicated task");
// prints message from main second
        pause();
// moves to the method pause() third
       
        System.out.println("And another");
        pause();
// prints second main message and repeats pause message last

    }
    public static void pause(){
        System.out.println("Press enter to continue...");
// prints pause() message forth
        console.nextLine();
// accepts user input from console fifth
// if user presses enter, java moves from pause back to main
    }
}
