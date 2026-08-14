package IfStatements;

public class ChessBoard {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
            if (i % 2 == j % 2){
                System.out.print("#");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}