package StringPractice;

public class PrintStringBackwards {
    public static void main(String[] args) {
        String word = "Rasputin";
    for (int i = word.length() - 1; i >=0; i--){ 
    // reverse of character printing
        System.out.print(word.charAt(i)); // 
    // start at word.length - 1 because index starts at 0
    // then decrease i till it reaches 0
    }
    }
}
