package Classes;

public class student {
// private instance variables    
    private int id;
    private String name;
    private String course;
    private int [] marks;

//constructor
public student (int id, String name, String course, int[] marks){
    this.id = id;
    this.name = name;
    this.course = course;
    this.marks = marks;
}
//calculate average mark
public int average(){
//total marks
    int total = 0;

//loop through array
for (int i = 0; i < marks.length; i++){
    total += marks[i];
}
return total/marks.length;
//average is an integer total/number of marks
}
//print method tells th eobject how to display its own data
void print(){
System.out.println("ID: " + id);
System.out.println("Name: " + name);
System.out.println("Course: " + course);
System.out.println("Average: " + average());
//average() is not a variable but rather a method
}
}
