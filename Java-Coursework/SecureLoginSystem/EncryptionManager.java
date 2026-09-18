package SecureLoginSystem;

import java.security.MessageDigest;//hashes passwords
import java.security.SecureRandom;//secure salt

public class EncryptionManager {
    public String generateSalt(){//adds random salt
        byte[] saltBytes=new byte[16];//byte array 
        SecureRandom random= new SecureRandom();//secure random generator
        random.nextBytes(saltBytes);//random values
        return bytesToHex(saltBytes);//bytes to string
    }
    public String hashPassword(String password, String salt){
        try{
            MessageDigest messageDigest= MessageDigest.getInstance("SHA-256");//SHA-256 hashing object
            String saltedPasswordString=salt+ password;//no same two hashes
            byte[] hashedBytes= messageDigest.digest(saltedPasswordString.getBytes());//hash from salted password
            return bytesToHex(hashedBytes);
        } catch (Exception e){
            System.out.println("Sorry there was an issue hashing the password. ");
            e.printStackTrace();
            return null;
        }

    }
    private String bytesToHex(byte[] bytes){
        StringBuilder hexString= new StringBuilder();
    for (int i=0; i< bytes.length; i++){//each byte processed
        hexString.append(String.format("%02x", bytes[i]));//converts to 2 digit hex
    }
    return hexString.toString();
    }
}
