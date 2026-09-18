package SecureLoginSystem;
import java.util.HashMap;

public class UserManager {
private HashMap<String, UserAccount> users;
private PasswordValidation passwordValidation;
private DictionaryChecker dictionaryChecker;
private EncryptionManager encryptionManager;
private LoginAttemptManager loginAttemptManager;
private FileManager fileManager;
    
public UserManager() {//creates manager objects and loads users
    fileManager=new FileManager();
    users=fileManager.loadUsers();
    passwordValidation=new PasswordValidation();
    dictionaryChecker= new DictionaryChecker();
    encryptionManager= new EncryptionManager();
    loginAttemptManager= new LoginAttemptManager();
}
public String registerUser(String username, String password){//new user rules
if (username==null || username.trim().equals("")) {
    return "Sorry but the username cannot be empty.";
}
if (password==null || password.equals("")){
    return "Sorry, the password field cannot be empty.";
}
if (users.containsKey(username.toLowerCase())){
    return "Sorry, this username already exists in the database.";
}
if (!passwordValidation.isValidPassword(password)){
    return passwordValidation.getMessage();
}
if (dictionaryChecker.isCommon(password)){
    return "Sorry, the password entered is too common.";
}
String salt= encryptionManager.generateSalt();//salts the password
String hashedPassword=encryptionManager.hashPassword(password, salt);//hashes password

UserAccount UserAccount= new UserAccount(username, salt,hashedPassword, 0, 0);//new user created 
users.put(username.toLowerCase(), UserAccount);//stores new user in memory
fileManager.save(users);// saves new data to file
return "Your registration has been successful.";
}
public String login(String username, String password){//login rules
    if (username==null || username.trim().equals("")) {
        return "Sorry but the username cannot be empty.";
}
    if (password==null || password.equals("")){
    return "Sorry, the password field cannot be empty.";
}
UserAccount userAccount= users.get(username.toLowerCase());//retrieves user account from memory
if (userAccount==null) {
    return "Sorry, these user credentials were not found.";//username not found
}
if (loginAttemptManager.isLocked(userAccount)){//stops login if account locked
    return "This account is locked.";
}
String hashedInput=encryptionManager.hashPassword(password, userAccount.getSalt());//hash password using stored salt
if (hashedInput.equals(userAccount.getHashedPassword())) {//checks whether stored hash and new password match
    loginAttemptManager.resetAttempts(userAccount);//reset failed logins
    fileManager.save(users);
    return "Your login has been successful.";
}else{
    loginAttemptManager.recordFailedAttempt(userAccount);//add login fail
    fileManager.save(users);
if (loginAttemptManager.isLocked(userAccount)) {//account is now locked
    return "You have made too many login attempts, this account is now locked for 5 minutes.";
}
return "Incorrect password. Number of attempts left: " + loginAttemptManager.getRemainingAttempts(userAccount);//shows how many attempts left
}
}
}