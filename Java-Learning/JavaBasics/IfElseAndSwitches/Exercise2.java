import java.util.*;



/**
 * Solution to Tutorial 7, Exercise 2.
 *
 * This time it is easier to use nested if statements.  If the user
 * can only be a student if they are over sixteen, there is no point
 * even asking them the question if they aren't.
 */
public class Exercise2 {

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
