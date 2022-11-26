import java.util.HashMap;

public class PasswordsAndIDS {

    HashMap<String, String> loginInfo = new HashMap<String, String>();


    PasswordsAndIDS(String userName, String passWord){
        loginInfo.put(userName, passWord);
    }
    PasswordsAndIDS(){
        loginInfo.put("Bro","pizza");
        loginInfo.put("Angie","subway");
        loginInfo.put("Jesus","sushi");
        loginInfo.put("Username", "password");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
