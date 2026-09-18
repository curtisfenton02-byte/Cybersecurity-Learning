package SecondAssignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BookingSystem { // BookingSystem class

	private static Scanner input = new Scanner(System.in); // Scanner
	private static Cottage[] cottages = new Cottage[18]; // Array

	public static void main(String[] args) throws Exception {
		loadCottages(); // Program starts
		runMenu();
		saveCottages();
		System.out.println("--Goodbye--");
	}

	private static void runMenu() {
		String choice;

		do {
			System.out.println("\n--Main Menu--"); // Appendix B
			System.out.println("1-View Cottages");
			System.out.println("2-Reserve Cottage");
			System.out.println("3-Cancel Cottage");
			System.out.println("Q-Quit");
			System.out.println("Pick: ");

			choice = input.nextLine().trim().toUpperCase();

			switch (choice) {
			case "1":
				displayCottages();
				break;
			case "2":
				reserveCottage();
				break;
			case "3":
				cancelCottage();
				break;
			case "Q":
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (!choice.equals("Q"));

		/*
		 * saveCottages(); System.out.println("--Goodbye--");
		 */
	}

// File Handling
	private static void loadCottages() throws FileNotFoundException {
		Scanner file = new Scanner(new FileReader("Java-Coursework/resources/cottages.txt"));
		int index = 0;

		while (file.hasNext() && index < cottages.length) {
			int number = file.nextInt();
			String type = file.next();
			int maxOcc = file.nextInt();
			double price = file.nextDouble();
			boolean seaView = file.nextBoolean();
			boolean pets = file.nextBoolean();
			String email = file.next();

			cottages[index++] = new Cottage(number, type, maxOcc, price, seaView, pets, email);

		}

		file.close();
	}

// File Saving
	private static void saveCottages() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("Java-Learning/JavaBasics/resources/cottages.txt"));

		for (Cottage c : cottages) {
			out.println(c.toFileFormat());

		}
		out.close();
	}

// User display
	private static void displayCottages() {
		System.out.println("\n--Cottage List--");
		for (Cottage c : cottages) {
			System.out.println(c);
		}

	}

//reserve cottage
	private static void reserveCottage() {
		String email = getValidEmail();

//reservation requirements
		int party = getInt("Party size: ");
		double maxPrice = getDouble("Maximum price per night: ");
		boolean wantSeaView = getYesNo("Sea view required? (Y/N):");
		boolean wantPets = getYesNo("Pets allowed? (Y/N):");

		Cottage bestMatch = null;
		int bestScore = 0;

		// Checking for any matching cottages
		for (Cottage c : cottages) {
			if (!c.isFree())
				continue;

			int score = 0;
			score++;
			if (c.getMaxOccupancy() >= party)
				score++;
			if (c.getPrice() <= maxPrice)
				score++;
			if (c.hasSeaView() == wantSeaView)
				score++;
			if (c.allowsPets() == wantPets)
				score++;

			if (score == 4) {
				c.reserve(email);
				System.out.println("Cottage " + c.getNumber() + "reserved!");
				return;
			}
			if (score > bestScore) {
				bestScore = score;
				bestMatch = c;
			}
		}
		// Offer next best cottage match if no cottage found
		if (bestMatch != null && bestScore >= 3) {
			System.out.println("\nNo perfect match found");
			System.out.println("Next best match found (" + bestScore + " out of 4 requirememts):");
			System.out.println(bestMatch);

			// Asking user if they want to reserve new cottage
			if (getYesNo("Would you like to reserve this cottag instead?")) {
				bestMatch.reserve(email);
				System.out.println("Cottage reserved!");
				return;
			}
		}
// no cottage found
		System.out.println("No suitable cottage found");
	}

	// Cancel
	private static void cancelCottage() {
		System.out.print("Enter your email to cancel reservation:");
		String email = input.nextLine().trim();
		for (Cottage c : cottages) {
			if (c.cancel(email)) {
				System.out.println("Reservation cancelled for cottage" + c.getNumber());
				return;
			}
		}
		System.out.println("No reservation found for that email");

	}

//asks user for email
	private static String getValidEmail() {
		while (true) {
			System.out.print("Please enter your email:");
			String email = input.nextLine().trim();
//ensures email is formatted correctly
			if (email.contains("@") && email.endsWith(".com"))
				return email;
			System.out.println("Invalid email. Email requires an @ and .com ");

		}
	}

//asks user Y/N
	private static boolean getYesNo(String message) {
		while (true) {
			System.out.print(message);
			String answer = input.nextLine().trim().toUpperCase();
			if (answer.equals("Y"))
				return true;
			if (answer.equals("N"))
				return false;
			System.out.println("Please enter Y or N ");

		}
	}

//ensures user enters a valid integer
	private static int getInt(String message) {
		while (true) {
			try {
				System.out.print(message);
				return Integer.parseInt(input.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid integer ");
			}
		}
	}
	// ensures user enters a valid double

	private static double getDouble(String message) {
		while (true) {
			try {
				System.out.print(message);
				return Double.parseDouble(input.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid number ");
			}
		}
	}

}
