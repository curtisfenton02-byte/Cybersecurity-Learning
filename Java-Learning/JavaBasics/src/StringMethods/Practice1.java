package StringMethods;

public class Practice1 {
    public static void main(String[] args) {
        String msg = "Building Java Programs";
        
        System.out.println(msg.length());
// 22 indexes, starting from 0, total in string, including spaces
        
        System.out.println(msg.indexOf("a")); 
// outputs the index number for the first a in string
        
        System.out.println(msg.substring(7));
// outputs from 7th index (g) till end of string

        System.out.println(msg.substring(7, 14));
// outputs from g to last a in Java then stops
        
        System.out.println(msg.toLowerCase());
// outputs message in lowercase

        String msg2 = msg.substring(5, 11);
// msg2 = ing Java
        
        System.out.println(msg2.toLowerCase());
// msg2 in lowercase

int space = msg.indexOf(" ");
// searches for first space in-between words in the string and stores it

String firstWord = msg.substring(0, space);
//this takes everything from index 0 up until the first space

System.out.println(firstWord);
//Building

String msg3 = "Hello ";
// testing how to find out if a String is only one word

int oneWord = msg3.indexOf(" ");
if (oneWord == -1){
// if there is no space, Java will return -1
        System.out.println(msg3);
} else{
        System.out.println(msg3.substring(0, oneWord));
}
    }
}
