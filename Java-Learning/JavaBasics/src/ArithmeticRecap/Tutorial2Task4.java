package ArithmeticRecap;

public class Tutorial2Task4 {
    public static void main(String[] args) {
        int number, square, cube;
    number = 0;
   
    square = number * number;
    cube = number * number * number;
    System.out.println(number + "\t" + square + "\t" + cube + "\t");
    // \t moves the cursor acrros to the next tab stop  

    number = 1;
 square = number * number;
    cube = number * number * number;
// everytime number changes, square and cube have to be recalculated
    System.out.println(number + "\t" + square + "\t" + cube + "\t");

}

}
