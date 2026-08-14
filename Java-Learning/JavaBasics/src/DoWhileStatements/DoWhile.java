package DoWhileStatements;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int score;
        do {
            System.out.println("Enter a score 0-100: ");
            score = console.nextInt();
        }
        while (score < 0 || score > 100);
    // repeat if socre is lower than 0 or greater than 100
        System.out.println("Valid score ");
        console.close();
    }
}
