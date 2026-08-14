package StringBuffer;

public class Practice3 {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("catcat");
        word.replace(3, 6, "dog");
// java replaces word's characters from index 3 'c' up to index 5
// 't', but not including index 6
// output: catdog
        System.out.println(word);
    }
}
