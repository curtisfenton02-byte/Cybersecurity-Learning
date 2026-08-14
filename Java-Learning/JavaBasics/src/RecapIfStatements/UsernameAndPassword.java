package RecapIfStatements;

public class UsernameAndPassword {
    public static void main(String[] args) {
         String username = "admin";
        String password = "1234";
        if (username.equals("admin") && password.equals("1234")) {
    // .equals() because comparing a String
            System.out.println("Login successful");
        }
        else {
            System.out.println("Incorrect details");
        }

    }
}

