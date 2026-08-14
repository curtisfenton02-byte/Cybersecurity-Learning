package Enums;

public class EnumPractice8 {
    public enum Fruit {
        Apple,
        Banana,
        Orange
    }
    public static void main(String[] args) {
        Fruit favourite = Fruit.Apple;
    switch (favourite) {
        case Apple:
            System.out.println("Apples ");
            
            break;
        case Banana:
            System.out.println("Banana ");
            break;
        case Orange:
            System.out.println("Oranges ");
            break;
    
        default:
            System.out.println("Unknown ");
            break;
    }
    }
}
