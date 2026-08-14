package Enums;

public class EnumPractice1 {
        public enum Season{
            January,
            Febuary,
            March,
            April
        }
            public static void main(String[] args) {

        Season thisSeason = Season.March;
        switch (thisSeason){
            case January:
                System.out.println("First season ");
                break;

            case March:
                System.out.println("Midway ");
                break;
            
            default:
                System.out.println("Another season "); 

        }
    }
}
