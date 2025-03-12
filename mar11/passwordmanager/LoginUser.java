package mar11.passwordmanager;

public class LoginUser {
     private String userName;
     private String password;

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    // we dont need the user to set the username
   /* public void setUserName(String userName) {
        this.userName = userName;
    }*/

    // and we dont want anyone to see the previous password
    /*public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }

    public void isValidUser(String userName, String password){

        if(this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("Valid user..");
        }else{
            System.out.println("Invalid credentials. Please try again...");
        }

    }
}
