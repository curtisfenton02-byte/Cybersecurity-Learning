package IfStatements;

import java.util.Scanner;

public class BusSeats {
    public static void main(String[] args) {
        int seated;
        int wheelcahirUsers;
        int standing;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of standing passengers ");
        seated = console.nextInt();
        System.out.println("Enter the number of wheelchair users ");
        wheelcahirUsers = console.nextInt();
        System.out.println("Enter the number of standing passengers ");
        standing = console.nextInt();

        if (seated == 60 && wheelcahirUsers ==2 && standing ==15 || seated ==60 && wheelcahirUsers == 0 && standing ==19){
            System.out.println("The bus is full ");
        } else {
            System.out.println("The bus is not full ");
        }
        console.close();

        }
    }


