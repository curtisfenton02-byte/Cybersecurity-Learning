package StringPractice;

public class stringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World"); // adds character to the end of object Hello
        System.out.println(sb);

        sb.insert(6, "Java "); // adds character to a specific location
        System.out.println(sb);

        sb.replace(0, 5, "Hi"); // replaces Hello with Hi
        System.out.println(sb); 
    }
}
