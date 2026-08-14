package ArithmeticRecap;

public class EnergyDrinks {
    public static void main(String[] args) {
      int customers = 12467;
      double purchasedEnergyDrinks = customers * (12.0 / 100);
      double citrusDrinks = purchasedEnergyDrinks * (64.0 / 100);
      System.out.println("The amount of customers in the survey that drink citrus flavour is " + citrusDrinks);

    }
}
