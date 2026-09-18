package ProgrammingCoursework;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class CommissionProject  {

public static void main(String[] args) throws FileNotFoundException {//allows 'FileReader' to throw a 'FileNotFoundException' if file isn't present
		// TODO Auto-generated method stub
	Scanner fileReader = new Scanner(new FileReader("Java-Learning/JavaBasics/resources/sales.txt"));// reads sales data from the 'sales.txt' file
	
	Scanner input = new Scanner(System.in);//add scanner for user input
	
	double totalincomebeforecommission = 0;//using double variable because we want to allow the user to type with decimals as per the Appendix B/C
	double totalcommission = 0;// start commission at 0
	
	//if no other value is entered, the default commission rate is 5.0% as per 'Appendix C'
	final double default_commission_rate = 5.0;
	double commissionRate = default_commission_rate;

// Asks if the manager wants to enter a custom commission rate
System.out.print("Do you want to pick a custom commission rate?Answer yes or no:");
String result = input.nextLine();

//ensures the program doesn't accept answers other than yes/no
while (!result.equals("yes")&& !result.equals("no")) {
	System.out.print("Invalid input. Please type yes or no:");
	result = input.nextLine();
}
if (result.equals("yes")) { 
	System.out.print("Please enter the commission rate:"); //asks manager to enter a custom commission rate
	
while (true) {// program checks that a number is entered
		while (!input.hasNextDouble()) {
			System.out.println("Invalid input. Please enter a number:");
			input.next();
			}
		commissionRate = input.nextDouble();
		input.nextLine();
		
		//checks whether number entered is between 0 and 100
		if (commissionRate > 0 && commissionRate < 100) {
			break;// exits loop if valid
		}else {
			System.out.println("Commission rate must be more than 0 and less than 100:");
			
		}
	}
}else {//Appendix C
	System.out.println("Default commission rate:" + default_commission_rate);

}
System.out.println("Sales Report:");

int numProperties = 4;// Studio, One-bedroom, Two-bedroom and Penthouse
for (int i = 0; i < numProperties; i++) {//using a for loop as per mentioned in the course sheet
if (!fileReader.hasNextLine()) break;
String property = fileReader.nextLine();//retrieves the line from the FileReader

if (property.equals("") && fileReader.hasNextLine()) {
	property = fileReader.nextLine();
}	
int numberofsales= 0;//declaring variables within the loop
double price = 0;
double income = 0;
double commission = 0;
if (!fileReader.hasNextInt() || !fileReader.hasNextDouble()) {// ensures the numbers of the sales and sold price are actually in the file 'sales.txt', otherwise the program will stop reading to prevent from a crash
	break;
}

numberofsales = fileReader.nextInt();
price = fileReader.nextDouble();

if (fileReader.hasNextLine());
fileReader.nextLine(); // moving to the next line

income = numberofsales * price;//calculates income
commission = income * (commissionRate/100) ;//calculates commission

//prints sales information into specified format with 'printf'
System.out.printf("Property Type:%s, Sales: %d, Sold Price: £%.2f, Income: £%.2f, Commission: £%.2f%n",property, numberofsales,price,income,commission);


totalincomebeforecommission += income;//overwrites the totals instead of adding to them
totalcommission += commission;

}

fileReader.close();//closes file and scanner
input.close();

//prints totals into console
System.out.printf("Total income:£%.2f\n", + totalincomebeforecommission);
System.out.printf("Total commission:£%.2f", + totalcommission);


}



		
	}


    


