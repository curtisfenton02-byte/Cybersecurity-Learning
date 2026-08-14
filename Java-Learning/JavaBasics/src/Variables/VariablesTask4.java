package Variables;

public class VariablesTask4 {
    public static void main(String[] args) {
        final int NoOfStudents = 5;
        double student1 = 50;
        double student2 = 75;
        double student3 = 65;
        double student4 = 85;
        double student5 = 90;

        double averageMark = (student1 + student2 + student3 + student4 + student5) / NoOfStudents;

        System.out.println("The average mark is: " + averageMark);
    }
}
