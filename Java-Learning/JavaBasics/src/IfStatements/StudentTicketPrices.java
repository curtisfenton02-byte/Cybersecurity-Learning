package IfStatements;
import java.util.Scanner;

public class StudentTicketPrices {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter your age: ");
                int age = keyboard.nextInt();
                System.out.println("Are you a student? ");
                String answer = keyboard.next();
                double ticketPrice;
                boolean student;
            if (answer.equalsIgnoreCase("yes")){
                student = true;
            } else{
                student = false;
            }

            if (age < 16 && student){
                System.out.println("Sorry students cannot be under 16 ");
            }
            else{
                if (age < 16){
                    ticketPrice = 10.0;
                }
            else {
                ticketPrice = 5.0;
            }
            if (student){
                if (age <= 64){
                    ticketPrice *= 0.9;
                }
                else{
                    ticketPrice *= 0.8;
                }
        
                }
            System.out.println("Ticket price is: £" + ticketPrice);
            }
                keyboard.close();
            }
            }
        
        




