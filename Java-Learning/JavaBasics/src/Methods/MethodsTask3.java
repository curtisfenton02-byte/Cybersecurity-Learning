package Methods;

public class MethodsTask3 {
    public static void numCompare(int a, int b){
    if (a > b){
        System.out.println(a + " is bigger ");
    }
    else if(b > a){
        System.out.println(b + " is bigger ");
    }
    else{
        System.out.println("Neither is bigger ");
    }
    }
    public static void main(String[] args) {
        numCompare(19, 45); 
        numCompare(12, 4);
        numCompare(299, 500);
        numCompare(5, 5);
    }
}

