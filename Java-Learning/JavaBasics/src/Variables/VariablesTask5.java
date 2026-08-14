package Variables;

public class VariablesTask5 {
    public static void main(String[] args) {
        int shares = 600;
        double perShare = 21.77;
        double totalShares = shares * perShare;

        double commission = totalShares * 0.02;
        double totalStock = totalShares + commission;

        System.out.println("The amount paid for stock without commission: £ " + totalShares);

    }
}
