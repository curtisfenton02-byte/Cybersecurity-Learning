package StringPractice;

public class PickingCapitals {
    public static void main(String[] args) {
        String text = "The quick brwon fox jumps over the lazy dog";
        String[] words = text.split(" "); 
        String result = "";
        // this creates an array where each word is an index
    for (int i = 0; i < words.length; i++){ // loops through the array
        String word = words[i];
        String capitalised = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        // first letter becomes uppercase and the rest lowercase
        result += capitalised; // adding everything together
    if (i < words.length - 1){ // add space between words except for the last word
        result += " ";
    }
    }
    System.out.println(result);
    }
}
