package Classes;

public class person {
// private instance variables
private String name;
private int age;
private char sexType;
// these are private so that code outside the class cannot
//directly access this variable - person1.age = 50 in another 
// class doesn't work

// constructor
public person(String name, int age, char sexType){
    this.name = name;
    this.age = age;
    this.sexType = sexType;
}

//instance method to print details
public void print(){
    System.out.println("Name: " + name); 
// name refers to the object variable - this.name
    System.out.println("Age: " + age);
    System.out.println("Sex: " + sexType);

}
}
