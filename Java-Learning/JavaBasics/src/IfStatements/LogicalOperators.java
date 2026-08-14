package IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = 13.2;
        char d = 'D';
        
        if (b >= a + 2){
            System.out.println("Expression 1 = True");
        } else if (15 > a && b > 21){
            System.out.println("Expression 2 = True");
        }else if (c > 10) {
            System.out.println("Expression 3 = True");
        }else if (d == 'D') {
         System.out.println("Expression 4 = True");
   
        }else {
            System.out.println("Expression = False");
        }
    }
}
