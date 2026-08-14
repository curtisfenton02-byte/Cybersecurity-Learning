package Methods;

import java.util.Scanner;

public class BooleanReturnMethod {
    static Scanner console = new Scanner(System.in);
    public static boolean yesOrno(String msg){ // msg will later on be "Enter yes or no: "
        // boolean as the method will return as true or false
        String ans = ""; // ans stores the input
    do{ // do-while loop runs once then checks if it should repeat
        System.out.print(msg);
        ans = console.next(); // stores user's answer

    } while (!(ans.equalsIgnoreCase("yes")|| ans.equalsIgnoreCase("no")));
    // keep asking msg until correct answer is given
    if (ans.equalsIgnoreCase("yes")){
        return true; // sends true back to main()
    } else{
        return false;
    }
    }
    public static void main(String[] args) {
        boolean choice = yesOrno("Enter yes or no: ");
        // this becomes: boolean choice = true or false
    if (choice){ 
        System.out.println("Do something ");
    }
    else{ 
        System.out.println("Do something else ");
    }
    }
}
