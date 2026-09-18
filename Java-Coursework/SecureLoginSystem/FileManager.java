package SecureLoginSystem;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;//stores users account in memory
import java.util.Scanner;

public class FileManager {
    private final String FILE_NAME= "Java-Coursework/resources/accountData.txt";//accountData used for user info
public HashMap<String, UserAccount> loadUsers(){//loads saved users into HashMap
    HashMap<String, UserAccount> users= new HashMap<String, UserAccount>();//creates empty HashMap
    try{
        Scanner scanner=new Scanner(new File(FILE_NAME));//opens accountData
        while (scanner.hasNextLine()) {
            String line=scanner.nextLine();
            String[] parts=line.split(",");//splits account info into separate values
    if (parts.length==5){//if all 5 values are there
        String username=parts[0];//the values
        String salt=parts[1];
        String hashedPassword=parts[2];
        int failedAttempts=Integer.parseInt(parts[3]);
        long lockUntil=Long.parseLong(parts[4]);

    UserAccount userAccount= new UserAccount(username, salt, hashedPassword, failedAttempts, lockUntil);//creates a user account from values
    users.put(username.toLowerCase(), userAccount);
    }
     }
     scanner.close();
}catch (Exception e){
}
    return users;
}
public void save(HashMap<String, UserAccount>users){//saves users into file
    try{
        PrintWriter writer= new PrintWriter(FILE_NAME);//opens file
    for (UserAccount userAccount: users.values()){
        writer.println(userAccount.toSaveString());//writes each user
    }
    
    writer.close();
}catch (Exception e){
    System.out.println("Sorry there was an error when saving user data.");
    e.printStackTrace();
}
}
}
