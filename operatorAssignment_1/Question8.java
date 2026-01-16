package operatorAssignment_1;

public class Question8 {

    public static void main(String[] args) {

        String username = "bhavik12";
        String password = "Bj12214846";
        String usernameByUser = "bhavik12";
        String passwordByUser = "Bj1221446";  
        boolean isLocked = false;
        int loginCount = 0;

        boolean isCorrect = !isLocked && username.equals(usernameByUser) && password.equals(passwordByUser);

        
        loginCount += (!isCorrect ? 1 : 0);

        
        isLocked = (loginCount >= 3) ? true : isLocked;

        
        String msg1 = isCorrect ? "Login Successfully!" : "Incorrect Username or Password";
        System.out.println(msg1);

        String msg2 = isLocked ? "Account Locked! Maximum attempts reached." : (!isCorrect ? "Try again" : "Welcome!");
        System.out.println(msg2);
    }
}
