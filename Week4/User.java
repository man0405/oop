package Week4;

public class User {
    private String username, password;
    private double balance = 10000.0;
   
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        username = "admin";
        password = "admin";
    }

    public String getUsername() {
        return username;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRePassword( String repassword) {
        return (password.equals(repassword));
    }

    public boolean isUsername( String checkUsername) {
        return (checkUsername.equals(this.username));
    }

    public boolean checkAccount(){
        if (username.equals("admin") && password.equals("admin")){
            return true;
        } else  return false;
    }

    
}
