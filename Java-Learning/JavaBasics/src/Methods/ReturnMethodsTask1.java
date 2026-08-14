package Methods;

import java.util.ArrayList;

public class ReturnMethodsTask1 {
    public static float calculateTax(float income, float taxRate){
        float tax = income * taxRate / 100;
        return tax;
    }
    public static float calculateTaxes(ArrayList<Float> incomes, float taxRate){
        float totalTax = 0; // variable to keep track of total
        for (float income : incomes){ // for each income in the list of incomes
            calculateTax(income, taxRate); // call the calculateTax method for every loop iteration
            totalTax += calculateTax(income, taxRate);
        }
                    return totalTax;

    }
    public static void main(String[] args) {
        ArrayList<Float> incomes = new ArrayList<>();
        incomes.add(25000f);
        incomes.add(4000f);
        incomes.add(5000f);
        float totalTax = calculateTaxes(incomes, 20);
        System.out.println("Total tax = £ " + totalTax);
    }
}
