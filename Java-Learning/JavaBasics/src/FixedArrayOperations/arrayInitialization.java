package FixedArrayOperations;

import java.util.Scanner;

public class arrayInitialization {
    public static void main(String[] args) {
 Scanner console = new Scanner(System.in);

        double[] sales = new double[10];
        int index;
        double sum = 0;
        double average;
        double largestSale;

        // Input
        for (index = 0; index < sales.length; index++) {
            System.out.print("Enter sale " + (index + 1) + ": ");
            sales[index] = console.nextDouble();
        }

        // Print
        System.out.println("\nSales:");

        for (index = 0; index < sales.length; index++) {
            System.out.print(sales[index] + " ");
        }

        // Sum
        for (index = 0; index < sales.length; index++) {
            sum += sales[index];
        }

        // Average
        average = sum / sales.length;

        // Maximum
        largestSale = sales[0];

        for (index = 1; index < sales.length; index++) {
            if (sales[index] > largestSale) {
                largestSale = sales[index];
            }
        }

        System.out.println("\n\nTotal = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Largest sale = " + largestSale);

        console.close();
    }
}
