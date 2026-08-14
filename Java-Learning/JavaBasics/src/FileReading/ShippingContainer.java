package FileReading;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ShippingContainer {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new FileReader("JavaBasics/resources/task2.txt"));

        int cargoLength = file.nextInt();
        int cargoWidth = file.nextInt();
        int cargoHeight = file.nextInt();
        int contLength = file.nextInt();
        int contWidth = file.nextInt();
        int contHeight = file.nextInt();
        int contAverage = file.nextInt();
        int maxLegal = file.nextInt();

        int cargoHold = cargoLength * cargoWidth * cargoHeight;
        int contVol = contLength * contWidth * contHeight;
        int totalCont = cargoHold / contVol;
        int proposedWeight = totalCont * contAverage;

        System.out.println("Containers = " + cargoHold + " / " + contVol + " = " + totalCont);
        System.out.println("Cargo = " + totalCont + " * " + contAverage + " = " + proposedWeight);
    
    if (proposedWeight > maxLegal){
        System.out.println("The cargo is too heavy ");
    }
    else if (proposedWeight < maxLegal){
        System.out.println("The cargo is light enough");
    }
    else{
        System.out.println("The cargo is equal to the allowed total ");
    }
    file.close();
    }
}
