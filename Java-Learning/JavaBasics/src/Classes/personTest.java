package Classes;

public class personTest {
    public static void main(String[] args) {

//creating first person object
person person1 = new person("Joe Bloggs", 21, 'm');

//create second person object
person person2 = new person("Sue White", 22, 'f');

//create third person object
person person3 = new person("Ben Black", 23, 'm');

//print details
person1.print();
person2.print();
person3.print();
// here java goes into the print() method in the person class
// and runs the code with each person's variables
    }
}
