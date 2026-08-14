package Methods;

public class TemperatureConversion {
    public static void main(String[] args) {
        double result = convert(25);
        System.out.println(result);
    }
    public static double convert(double celsius){
        return (celsius * 9/5) + 32;
        // formula = (C × 9 / 5) + 32
    }
}
