package Enums;

public class EnumPractice9 {
    public enum Drink {
        Tea,
        Coffee,
        Hot_Chocolate,
        Water
    }
    public static void main(String[] args) {
        Drink order = Drink.Water;
        switch (order) {
            case Tea:
                System.out.println("Brewing tea ");
                
                break;
            case Coffee:
                System.out.println("Brewing coffee ");
                break;
            case Hot_Chocolate:
                System.out.println("Adding chocolate ");
                break;
            case Water:
                System.out.println("Pouring water ");
                break;
        
            default:
                System.out.println("Unknown drink ");
                break;
        }
    }
}
