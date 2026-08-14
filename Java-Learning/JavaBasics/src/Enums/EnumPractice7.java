package Enums;

public class EnumPractice7 {
    public enum MenuOption {
        Play,
        Settings,
        Exit
    }
    public static void main(String[] args) {
        MenuOption option = MenuOption.Settings;
    switch (option) {
        case Play:
            System.out.println("Starting game ");
            
            break;
        case Settings:
            System.out.println("Opening settings ");
            break;
        case Exit:
            System.out.println("Goodbye ");
            break;
    
    } 
    }
}
