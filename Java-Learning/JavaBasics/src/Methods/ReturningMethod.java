package Methods;

public class ReturningMethod {
    public static int celsius = 0;
    public static void main(String[] args) 
    {
         System.out.printf("1. celsius = %d\n", celsius);
        updateCelsius(30);
        System.out.printf("4. celsius = %d\n", celsius);
        }
    public static void updateCelsius(int celsius) {
       System.out.printf("2. celsius = %d\n", celsius);
         celsius = celsius;
       System.out.printf("3. celsius = %d\n", celsius);        
    }
    }

