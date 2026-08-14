package IfStatements;
import java.util.Scanner;
public class ComparingAges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
    if (age < 16){
        System.out.println("The price is £5 ");
    }
    else if 
        (age >= 16 && age <= 64){
            System.out.println("The price is £10 ");

        }
        else{
            System.out.println("The price is £5 ");
        }
        keyboard.close();
    }
    }

