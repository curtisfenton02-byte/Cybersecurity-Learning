package RecapIfStatements;

public class SimpleCalculator {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 5;
        char operation = '+';

        if (operation == '+') {
            System.out.println("Result: " + (number1 + number2));
        }
        else if (operation == '-') {
            System.out.println("Result: " + (number1 - number2));
        }
        else if (operation == '*') {
            System.out.println("Result: " + (number1 * number2));
        }
        else if (operation == '/') {
            System.out.println("Result: " + (number1 / number2));
        }

    }
}

