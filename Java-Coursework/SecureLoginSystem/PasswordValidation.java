package SecureLoginSystem;
public class PasswordValidation {
    public boolean isValidPassword(String password){//checks if password is valid
        if (password==null|| password.length()<8){//can't be empty or less than 8 characters
            return false;
        }
boolean containsUppercase=false;
boolean containsLowercase=false;
boolean containsDigit=false;
boolean containsSpecialCharacter=false;//password managing

String specialCharacters= "@~#;:[]{},<.>/\\|?!$%^&*()-_+'`";
char[] characters=password.toCharArray();//turns password to character array

for (int i=0; i<characters.length; i++){//loop through each character
    if(Character.isUpperCase(characters[i])){
        containsUppercase=true;
    }else if (Character.isLowerCase(characters[i])){
        containsLowercase=true;
    }else if (Character.isDigit(characters[i])){
        containsDigit=true;
    }else if (specialCharacters.contains(String.valueOf(characters[i]))){
        containsSpecialCharacter=true;
    }
}

return containsUppercase && containsLowercase && containsDigit && containsSpecialCharacter;//valid password meets the requirements
    }
    public String getMessage(){//if password isn't suitable
        return "Sorry, the password needs to be at least 8 characters long, contain one uppercase and lowercase letter, and contain a special character (eg: ?/)";
    }
}
