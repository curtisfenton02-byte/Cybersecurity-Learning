package Methods;

import java.util.Scanner;

public class MethodsTask4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String event = "";
        int hours = 0;
        int minutes = 0;
    do{
        System.out.print("Enter event name: ");
         event = console.nextLine();

        System.out.println("Enter hour: ");
         hours = Integer.valueOf(console.nextInt());

        System.out.println("Enter minute: ");
         minutes = Integer.valueOf(console.nextInt());
    } while (((hours < 0 || hours > 24) || (minutes < 0 || minutes > 60 ) || event.isEmpty()));
    diaryReminder(event, hours, minutes);
    console.close();
    }
    public static void diaryReminder(String event, int hour, int minute){
        System.out.println(event + "@" + hour + ":" + minute);
    }

}
