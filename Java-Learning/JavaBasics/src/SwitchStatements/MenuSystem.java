package SwitchStatements;

import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    int option;
    do{
    System.out.println("Choose an option: ");
   System.out.println("1 Deposit");
    System.out.println("2 Withdraw");
    System.out.println("3 Balance");
    System.out.println("0 Exit");
        option = console.nextInt();
  
    switch (option) {
        case 1:
            System.out.println("Deposit ");
            
            break;
        case 2:
            System.out.println("Withdraw ");
            break;
        case 3:
            System.out.println("Balance ");
        break;
        case 0:
            System.out.println("Exit ");
            break;
       
    
        default:
            System.out.println("Incorrect input error ");
            break;
    }

    } while (option != 0);
    console.close();
        
    }
    }

