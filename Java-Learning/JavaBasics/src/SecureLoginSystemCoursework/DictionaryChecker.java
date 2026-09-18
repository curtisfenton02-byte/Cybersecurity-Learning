package SecureLoginSystemCoursework;
import java.io.File;//opens dictionary file
import java.util.HashSet;
import java.util.Scanner;


public class DictionaryChecker {
    private HashSet<String> passwords= new HashSet<String>();//stores passwords for quick lookup

    public DictionaryChecker(){
        try{
            Scanner scanner = new Scanner(new File("Java-Learning/JavaBasics/resources/commonPasswords.txt"));//reads commonPasswords.txt file
            while (scanner.hasNextLine()){//redes each line
                passwords.add(scanner.nextLine().trim().toLowerCase());//turns text to lowercase and removes spaces
            }
            scanner.close();//closes scanner
        }catch (Exception e){//error handling
            System.out.println("Sorry, the dictionary file was not found");
            e.printStackTrace();//show error
        }
    }    
public boolean isCommon(String password){//checks if password is common
    String lowerPassword= password.trim().toLowerCase();

    for (String commonPassword: passwords){//loops through common passwords
    if (lowerPassword.equals(commonPassword)|| lowerPassword.contains(commonPassword)) {//finds exact matches and any variations
        return true;
    }
}
        return false;//no matching password
}
}
