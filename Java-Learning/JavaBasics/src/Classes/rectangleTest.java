package Classes;

public class rectangleTest {
    public static void main(String[] args) {
// create rectangle objects

//this uses the default constructor (1 x 1)
rectangle r1 = new rectangle();

//creates a 2 x 3 rectangle
rectangle r2 = new rectangle(2,3);

//creates a 4 x 6 rectangle
rectangle r3 = new rectangle(4,6);

//print original areas
System.out.println("Rectangle 1's area is: " + r1.area());
System.out.println("Rectangle 2's area is: " + r2.area());
System.out.println("Rectangle 3's area is: " + r3.area());

//scale rectangles
r1.scale(4);
r2.scale(0.5);

//print new areas
System.out.println("Rectangle 1's new area is: " + r1.area());
System.out.println("Rectangle 2's new area is: " + r2.area());


//print the new rectangle's area
System.out.println("Rectangle 1 and 2 area added: " + r1.add(r2).area());
//(new Rectangle(5,5.5)).area() java does 5 × 5.5 = 27.5
    }
}
