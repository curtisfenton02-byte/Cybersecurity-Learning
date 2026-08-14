package SwitchStatements;
import java.util.Scanner;

public class UsersBrithMonth {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
                        System.out.println("Enter your age: ");
                        int age = keyboard.nextInt();
                        System.out.println("Are you a student? ");
                        String answer = keyboard.next();
                        System.out.println("Enter the current month: ");
                        String currentMonth = keyboard.next();
                        System.out.println("Enter your birthday month: ");
                        String birthMonth = keyboard.next();

                   boolean student = answer.equalsIgnoreCase("yes");

                    if (currentMonth.equalsIgnoreCase(birthMonth)){
                        System.out.println("Ticket is free ");
                    }
                    else{
                        switch (birthMonth) { // switch statement
                            case "Jan":
                                System.out.println("Q1.1");
                                
                                break;
                    case "Feb":
                System.out.println("Q1.2");
                break;
                case "Mar":
                   System.out.println("Q1.3");
                   break;
                   case "Apr":
                        System.out.println("Q1.4");
                        break;

                        default:
                            System.out.println("Invalid month ");
                        }
    

                        double ticketPrice;
                 
        
                    if (age < 16){
                        ticketPrice = 5.0;
                                        }
                    else
                        if (age < 16){
                            ticketPrice = 10.0;
                        }
                    else {
                        ticketPrice = 5.0;
                    }
                    if (student){
                        if (age < 16 && student){
                            System.out.println("Students cannot be under 16 ");
                        }
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
                
                
        
        
        
        
        



