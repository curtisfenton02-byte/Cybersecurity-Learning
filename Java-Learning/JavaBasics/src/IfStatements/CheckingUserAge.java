package IfStatements;

import java.util.Scanner;

public class CheckingUserAge {
    public static void main(String[] args){
  Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter age: ");
        int age = keyboard.nextInt();

        if (age >= 16){
            System.out.println("You are old enough to vote ");
        } else{
            System.out.println("Sorry you are too young to vote ");
        }
        if (age >= 16 && age <= 20){
            System.out.println("Your age is between 16 and 20");

        }
    keyboard.close();
    }

}
