package Classes;

public class car {
// instance variables
// these describe what every car object should contain
    String regNo;
    int regYear;
    
    static String manufacturer = "Ford";
//this is a static variable (belongs to the class)
// static goes before the data type

public static void printManufacturer(){
    System.out.println(manufacturer);
// this is a static method
}

// constructor
// whenever someone creates a car, java will use this constructor
public car(String regNo, int year){ // parameters
// Java copies the arguments into the parameters
    
this.regNo // this is the instance variable
 = regNo; // this is the constructor parameter

 this.regYear // 'this' means the regNo variable belonging to
 // the car object
 = year; // here Java copies the values from the parameters into
 // the object
 
 // after this line, the constructor has finished and the 
 // temporary parameters dissapear, leaving only the object with  
 // the values
}
    public int getYear(){ // accessor
        return regYear;
    }

    public void setyear(int year){ // mutator
        if (year <= 2026) {
            regYear = year;
        }
    }

    public int calcAge(int currentYear) { // behaviour
    //this is an instance method used to calculate the 
    // car object's age

        return currentYear - regYear;
    // here regYear refers to the object variable for myCar which 
    // makes its value = 2005
    // whilst cuurentYear is the parameter and stores 2026 from
    //main
    }
public static void main(String[] args) {
    car myCar = new car // this creates a new car object
// myCar is a reference variable (not the actual object), this 
// points to the object which contains regno = ABC123 and 
// regyear = 2005
    ("ABC123", 2005);
    // values in brackets are called the arguments
    car oldCar = new car("DEF456", 2006);

    int age = myCar.calcAge(2026);
    // 2026 - 2005 = 21

    System.out.println(age);

    System.out.println(myCar.regNo);
// here the dot means go to the object pointed to by mycar and 
// find ABC123 then replace myCar.regNo with ABC123

    myCar.regYear = 2015;
// again the dot tells java to go to myCar and find regyear then
// replace its value with 2015

System.out.println(car.manufacturer);

car.printManufacturer();
//calling a static method

    System.out.println(oldCar);
}
}
