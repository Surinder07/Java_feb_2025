package mar11.passwordmanager;

public class MainLogin {
    public static void main(String[] args) {

        LoginUser loginUser = new LoginUser("user","12345");

     //   loginUser.isValidUser("user","12345");

        // Hacker

        loginUser.setPassword("mypassword");
        System.out.println(loginUser.getUserName());
        loginUser.isValidUser("user","mypassword");


        // you forgot username
    }
}
