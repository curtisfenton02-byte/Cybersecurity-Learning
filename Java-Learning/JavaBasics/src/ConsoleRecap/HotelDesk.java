package ConsoleRecap;

import java.util.Scanner;

public class HotelDesk {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a hotel room number between 1 and 999: ");
        int roomNumber;
        double roomPrice;
        roomNumber = console.nextInt();
        System.out.println("Enter a room price between 0.99 and 999.99: ");
        roomPrice = console.nextDouble();
        System.out.printf("The room number is %03d%n, and the price is £%.2f%n", roomNumber, roomPrice );
    console.close();
    }
}
