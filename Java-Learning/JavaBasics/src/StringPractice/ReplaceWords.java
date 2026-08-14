package StringPractice;

public class ReplaceWords {
    public static void main(String[] args) {
        String word = "The quick brown fox jumps over the lazy dog";
        word = word.replace("fox", "TEMP");
        word = word.replace("dog", "fox");
        word = word.replace("TEMP", "dog");
        System.out.println(word);
        /*  TEMP is used so that we don't create 'dog/fox jumps
         over the lazy dog/fox' by changing fox to TEMP first
         dog can be changed without affecting the earlier word */
    }
}
