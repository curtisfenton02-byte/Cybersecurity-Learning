package CharMethods;

import java.util.Scanner;

public class IsConditionTrue {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.println("Enter a word ");
       String word = console.next(); 
       // the word is cats
   
       if(word.charAt(word.length()-1) == 's'){ 
        System.out.println(word + " is plural"); 
 // word.length (cats) = 4 - 1 means last index is 3 (s) and s == s
    // so condition is true
    
    } else{
      System.out.println(word + " is not plural");
    }
    console.close();
    }
    }
    

