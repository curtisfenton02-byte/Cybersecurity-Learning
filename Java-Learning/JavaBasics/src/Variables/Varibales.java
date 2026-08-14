package Variables;

public class Varibales {
    public static void main(String[] args) {
        int num1, num2, sum, num3, prod;
        num1 = 25;
        num2 = 8;
        num3 = 2;

        num1 = num1 + 5;
        sum = num1 + num2;
        prod = sum * num3;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
        System.out.println(prod);
        System.out.println("num3: " + num3 + " prod: " + prod);
    }
}
