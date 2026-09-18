package SecureLoginSystem;
import java.util.Scanner;

public class MainApplication {
private static Scanner scanner= new Scanner(System.in);
public static void main(String[]args){

UserManager userManager = new UserManager();
String menuOption= "";//stores menu choice

do{//menu list
System.out.println();
System.out.println("Secure Login Menu");
System.out.println("\n1- Register New");
System.out.println("2 - Login");
System.out.println("Q-Quit");
System.out.println("Choice: ");

menuOption=scanner.nextLine().toUpperCase();//read and turn to uppercase
switch (menuOption) {//carries out user option
    case "1":
        register(userManager);
        break;
    case "2":
        login(userManager);
        break;
    case "Q":
        System.out.println("Closing application.");
        break;
    default:
        System.out.println("Invalid menu option.");
        break;
}
}while (!menuOption.equals("Q"));//repeats menu until Q
scanner.close();
}

private static void register(UserManager userManager){//new user info
   System.out.print("Please enter your username: ");
   String username=scanner.nextLine();
   
   System.out.print("Please enter your password: ");
   String password=scanner.nextLine();
   
   String message=userManager.registerUser(username, password);//sends info to UserManager
   System.out.println(message);
}
private static void login(UserManager userManager){//handles login info
    System.out.print("Please enter your username: ");
    String username=scanner.nextLine();
    
    System.out.print("Please enter your password: ");
    String password=scanner.nextLine();
    
    String message=userManager.login(username, password);
    System.out.println(message);
}

    }


    