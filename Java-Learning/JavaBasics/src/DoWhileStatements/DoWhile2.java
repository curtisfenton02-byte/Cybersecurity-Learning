package DoWhileStatements;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Type yes to continue ");
            answer = console.next();
        }
        while (!answer.equals("yes"));
        System.out.println("Thank you ");
    console.close();
    }

}
