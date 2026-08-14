package RecapIfStatements;

public class Task2 {
    public static void main(String[] args) {
        int mark = 85;

if (mark >= 70) {
    System.out.println("First"); // java checks top to bottom
}
else if (mark >= 60) {
    System.out.println("2:1");
}
else if (mark >= 50) {
    System.out.println("2:2");
}
else {
    System.out.println("Fail");
}
    }
}
