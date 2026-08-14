package Enums;

public class EnumPractice4 {
    public enum Day {
        Monday,
        Tuesday,
        Wednesday
    }
    public static void main(String[] args) {
        Day today = Day.Monday;

    switch (today){
        case Monday:
            System.out.println("Beggining of the week ");
            break;
        case Tuesday:
            System.out.println("Second day ");
            break;
        case Wednesday:
            System.out.println("Midweek ");
            break;
    }
    }
}
