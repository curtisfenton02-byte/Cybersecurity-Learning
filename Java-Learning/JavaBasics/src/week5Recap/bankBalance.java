package week5Recap;

public class bankBalance {
    public static void main(String[] args) {
        float bankBalance = 500f; 
// f for float otherwise java treats the number as a double
        float purchase = 75f;
        float total = bankBalance - purchase;
        System.out.println("Remaining balance: £" + total);
    }   
}
