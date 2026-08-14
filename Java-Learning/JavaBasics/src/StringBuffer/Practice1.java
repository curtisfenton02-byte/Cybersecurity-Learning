package StringBuffer;

public class Practice1 {
    public static void main(String[] args) {
StringBuffer birthdayMsg = new StringBuffer("Happy Birthday");
birthdayMsg.insert(6, "40th ");
// java inserts the new text '40th' before index 6 'B'
// making it Happy 40th Birthday

System.out.println(birthdayMsg);
    }
}
