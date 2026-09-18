package SecureLoginSystemCoursework;
public class UserAccount {
    private String username;//account details
    private String salt;
    private String hashedPassword;
    private int failedAttempts;
    private long lockUntil;

    public UserAccount(String username, String salt, String hashedPassword, int failedAttempts, long lockUntil){//creates user with info
        this.username=username;//values assigned to object field's
        this.salt=salt;
        this.hashedPassword = hashedPassword;
        this.failedAttempts=failedAttempts;
        this.lockUntil= lockUntil;
    }
    public String toSaveString(){//turns data into string for storage
        return username + "," + salt + "," + hashedPassword + "," + failedAttempts + "," + lockUntil;
    }
    public String getUsername() { return username;}//other classes can access data
    public String getSalt() {return salt;}
    public String getHashedPassword(){return hashedPassword;}
    public int getFailedAttempts(){return failedAttempts;}
    public long getLockUntil(){ return lockUntil;}

    public void setFailedAttempts(int attempts){this.failedAttempts= attempts;}//classes can modify
    public void setLockUntil(long time){this.lockUntil=time;}
}
