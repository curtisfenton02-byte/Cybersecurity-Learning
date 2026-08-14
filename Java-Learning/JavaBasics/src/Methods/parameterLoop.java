package Methods;

public class parameterLoop {
    public static void repeatWord(String word, int times){ 
        // adding a word plus how many times to repeat it
        for(int i = 0; i < times; i++){ 
            // for loop to increase count
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        repeatWord("Java", 5);
        repeatWord("Hello", 3);
    }
}
