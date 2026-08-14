package Enums;

public class EnumPractice6 {
    public enum Pet {
        Dog, 
        Cat,
        Fish
    }
    public static void main(String[] args) {
        Pet myPet = Pet.Dog;
    if (myPet == Pet.Dog){
        System.out.println("Walk time ");
    }
    else if (myPet == Pet.Fish) {
        System.out.println("Feed some fish flakes ");
        
    }
    else{
        System.out.println("The cat is sleeping ");
    }
    }
    
}
