package SecureLoginSystemCoursework;

public class LoginAttemptManager {
    private static final int MAX_ATTEMPTS=3;
    private static final long LOCK_TIME_MILLIS=5*60*1000;//5 minutes

    public boolean isLocked(UserAccount userAccount){//checks if account locked
        long currentTime= System.currentTimeMillis();
        return currentTime< userAccount.getLockUntil();
    }
    public void recordFailedAttempt(UserAccount userAccount){
        int attempts=userAccount.getFailedAttempts()+1;//adds 1 failed attempt
        userAccount.setFailedAttempts(attempts);
    
        if (attempts>= MAX_ATTEMPTS){
            long lockUntil=System.currentTimeMillis()+ LOCK_TIME_MILLIS;//+ 5 minutes
            userAccount.setLockUntil(lockUntil);
        }
    }
    public void resetAttempts(UserAccount userAccount){
        userAccount.setFailedAttempts(0);
        userAccount.setLockUntil(0);
    }
    public int getRemainingAttempts(UserAccount userAccount){
        return MAX_ATTEMPTS - userAccount.getFailedAttempts();
    }
    
}
