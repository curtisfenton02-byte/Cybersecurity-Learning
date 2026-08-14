package ForLoops;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
