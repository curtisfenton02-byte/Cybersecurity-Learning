package IfStatements;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = console.nextInt();
        double price;

    if (age < 12){
        price = 5.0;
    }
    else{
        price = 10.0;
        System.out.println("Student true or false: ");
        boolean student = console.nextBoolean();
    if (student){
        price -= 2.0;
        }
    }
    System.out.println("Ticket price: £" + price);
console.close();    
}

}
