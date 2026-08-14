package IfStatements;

public class ComparingFloatingPoints {
    public static void main(String[] args) {
        
    double a = 0.1 + 0.2;
    double b = 0.3;
    double epsilon = 0.000001;

if (Math.abs(a - b) <= epsilon){
    System.out.println("Equal ");
}
else{
    System.out.println("Not equal ");
}
    }
}
