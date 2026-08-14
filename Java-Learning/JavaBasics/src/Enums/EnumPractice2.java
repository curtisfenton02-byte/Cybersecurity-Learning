package Enums;

public class EnumPractice2 {
        public enum Light{
            Red,
            Amber,
            Green
        }
            public static void main(String[] args) {
                Light current = Light.Green;
                System.out.println(current);
    }
}
