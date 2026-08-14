package constructor;

public class shirt {
    
    public static String colour;
    public static char size;

    shirt(){
    }
    shirt(String newColour, char newSize){
        colour = newColour;
        size = newSize;
    }

    public static void putOn(){
        System.out.println("shirt is on");
    }
    public static void takeOff(){
        System.out.println("shirt is off");
    }
    public static void setColour(String newColour){
        colour = newColour;
    }
    public static void setSize(char newSize){
        size = newSize;
    }
}
