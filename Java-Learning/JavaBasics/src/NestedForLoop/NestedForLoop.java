package NestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++){ //per line
            for (j = 1; j <= i; j++){ //per star
                System.out.print(" *"); // j increases as i does
            }
            System.out.println();
        }
    }
}
