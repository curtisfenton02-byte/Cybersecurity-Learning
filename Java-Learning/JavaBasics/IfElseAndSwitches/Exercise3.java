/**
 * Solution to Tutorial 7, Exercise 3.
 *
 * This time it is easier to use nested if statements.  If the user
 * can only be a student if they are over sixteen, there is no point
 * even asking them the question if they aren't.
 */
import java.util.Scanner;
public class Exercise3 {

  private static Scanner console = new Scanner(System.in);

  /**
   * Compute a ticket price based on an age input by the user.
   *
   * @param args command-line arguments, ignored.
   */
  public static void main(String[] args) {

    // Read the age from the user.
    System.out.print("Please enter your age: ");
    int age = console.nextInt();

    // Ask for the current month and the user's birth month.
    System.out.print("Please enter the current month (Jan, Feb, etc.) ");
    String currentMonth = console.next();
    System.out.print("Please enter the user's birth month (Jan, Feb, etc.) ");
    String birthMonth = console.next();

    // This construct is a bit ugly, in practice you'd do some parsing with
    // Java's date utilities and compute the discount code mathematically.
    if (currentMonth.equals(birthMonth)) {

      switch (birthMonth) {
        case "Jan":
          System.out.println("Happy birthday!  Your ticket is free, code: Q1.1");
          break;
        case "Feb":
          System.out.println("Happy birthday!  Your ticket is free, code: Q1.2");
          break;
        case "Mar":
          System.out.println("Happy birthday!  Your ticket is free, code: Q1.3");
          break;
        case "Apr":
          System.out.println("Happy birthday!  Your ticket is free, code: Q2.1");
          break;
        case "May":
          System.out.println("Happy birthday!  Your ticket is free, code: Q2.2");
          break;
        case "Jun":
          System.out.println("Happy birthday!  Your ticket is free, code: Q2.3");
          break;
        case "Jul":
          System.out.println("Happy birthday!  Your ticket is free, code: Q3.1");
          break;
        case "Aug":
          System.out.println("Happy birthday!  Your ticket is free, code: Q3.2");
          break;
        case "Sep":
          System.out.println("Happy birthday!  Your ticket is free, code: Q3.3");
          break;
        case "Oct":
          System.out.println("Happy birthday!  Your ticket is free, code: Q4.1");
          break;
        case "Nov":
          System.out.println("Happy birthday!  Your ticket is free, code: Q4.2");
          break;
        case "Dec":
          System.out.println("Happy birthday!  Your ticket is free, code: Q4.3");
          break;
      }

    } else {

      // Calculate the price based on the table, and if the user is aged
      // over sixteen, check if they are a student and modify the
      // multiplier.
      int price;
      float multiplier = 1.0f;
      if (age < 16) {
        price = 5;
      } else {
        System.out.print("Are you a student [Y/N]? ");
        boolean student = console.next().equals("Y");
        if (age < 65) {
          price = 10;
          if (student) {
            multiplier = 0.9f;
          }
        } else {
          price = 5;
          if (student) {
            multiplier = 0.8f;
          }
        }
      }

      // Compute the final price and output it to the user.
      float discounted = price * multiplier;
      System.out.printf("Your age is %d, the price is £%.2f", age, discounted);

    }
  }

}
