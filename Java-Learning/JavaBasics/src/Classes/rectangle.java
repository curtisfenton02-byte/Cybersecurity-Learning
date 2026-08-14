package Classes;

public class rectangle {
//private instance variables
    private double width;
    private double height;

// default constructor
//creates a 1 x 1 rectangle
    public rectangle(){
        this.width = 1;
        this.height = 1;
// for a default constructor the object needs to create its own
// values
    }
//overloaded constructor 
//creates rectangle with given width and height
public rectangle(double width, double height){
    this.width = width;
    this.height = height;
}  
//adding another rectangle and returning a new rectangle
public rectangle add(rectangle r){
    double newWidth = width + r.width;
    double newHeight = height + r.height;
return new rectangle(newWidth,newHeight);//this creates a brand new object
//here 'r' is the parameter object and (this.)width is the current
//object
}
// calculate and return area
// this method has access to width and height because they belong
// to the object
public double area(){
    return width * height;
}
//scale rectangle size
public void scale(double factor){
    width = width * factor;
    height = height * factor;
//if parameter = 4, java does object variable x 4 then store
// the new value in the object's variable
// no 'this' is need because there is no width or hieght
// parameter here
}
}
