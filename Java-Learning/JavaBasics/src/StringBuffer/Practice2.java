package StringBuffer;

public class Practice2 {
    public static void main(String[] args) {
        StringBuffer message = new StringBuffer("Hello");
        message.append(" World");
// java adds 'World' onto the end of 'Hello'
System.out.println(message);
    }
}
