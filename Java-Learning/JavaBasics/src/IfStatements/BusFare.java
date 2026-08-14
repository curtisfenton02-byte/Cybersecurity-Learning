package IfStatements;

import java.util.Scanner;

public class BusFare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your age: ");
    double fare;
    int age = console.nextInt();
    if (age <16){
        fare = 2.0;
    }
    else{
        if (age <65) {
            fare = 5.0;
            
        }else{
            fare = 3.0;
        }
    } 
System.out.println("Fare = £" + fare);
console.close();    
}
    }

