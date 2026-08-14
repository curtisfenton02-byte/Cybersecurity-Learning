package Enums;

public class EnumPractice3 {
    public enum Weather{
        Sunny,
        Rainy,
        Snowy
    }
    public static void main(String[] args) {
        Weather today = Weather.Sunny;

        if (today == Weather.Sunny){
            System.out.println("Take sunglasses ");
        }
    }
}
