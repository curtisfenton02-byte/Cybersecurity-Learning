package Classes;

public class studentTest {
    public static void main(String[] args) {
//create first student object
student s1 = new student(1234, "Joe Bloggs", "Computer Studies", new int[]{65,55,78,72,50});

//second student object
student s2 = new student(2341, "Susie White", "Computer Science", new int[]{57,85,58,49,61});

//third student object
student s3 = new student(3412, "Ben Black", "Software Engineering", new int[]{71,45,66,70,51});
    
//print student details
s1.print();
s2.print();
s3.print();
}
}
