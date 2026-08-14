package Enums;

public class EnumPractice5 {
    public enum Transport{
        Car, 
        Bus,
        Train,
        Bike
    }
    public static void main(String[] args) {
        Transport travel = Transport.Bike;
    
    switch (travel) {
        case Bus:
        case Train:
            System.out.println("Public Transport ");
            
            break;
        case Car:
            System.out.println("Personal vehicle ");
            break;
        case Bike:
            System.out.println("Exercise ");
            break;
 }
    }
}
