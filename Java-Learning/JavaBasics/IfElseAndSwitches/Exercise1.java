import java.util.*;

/**
 * Solution to Tutorial 7, Exercise 1.
 *
 * Note that this problem could just as easily (potentially more clearly)
 * have been solved with the following if construct:
 *
 * if (age < 16 || age > 64) {
 *   price = 5;
 * } else {
 *   price = 10;
 * }
 */
public class Exercise1 {

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

    // Calculate the price based on the table.
    int price;
    if (age < 16) {
      price = 5;
    } else if (age < 65) {
      price = 10;
    } else {
      price = 5;
    }

    // Output the price to the user.
    System.out.printf("Your age is %d, the price is £%d", age, price);

  }

}
