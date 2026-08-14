package Methods;

public class drawASquare {
    private static void drawSquare(int size){
for(int i = 0; i < size; i++){ // controls number of rows printed
    for(int j = 0; j < size; j++){ // for each row (4) print * * * *
        System.out.print("*"); // in one line
    }
    System.out.println(); // moves to new line after each print
}
    }
    public static void main(String[] args) {
        drawSquare(4); // tells the method that size = 4
    }
}
