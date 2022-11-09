package Bank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    User userLogin;
    User testTranfer = new User();
    private View viewTest;
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

    public Controller (View viewTest){
        this.viewTest = viewTest;
    }

    public void callFirst(){
        switch(viewTest.choiceFirst()){
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                forgotPassword();
                break;
            case 4:
                System.out.println("Exit");
                break;
        }
    }

    public void callNext(){
        switch(viewTest.choiceNext()){
            case 1:
                System.out.println("Your balance:  " + currency.format(checkBalance()));
                callNext();
                break;
            case 2:
                reCharge();
                callNext();
                break;
            case 3:
                withdraw();
                callNext();
                break;
            case 4:
                transferTo(testTranfer);
                callNext();
                break;
            case 5:
                callFirst();
                break;
        }
    }


    //Login
    public void login(){
        int count = 1;
        while(true){
            System.out.println("----------Login----------");
            userLogin =  viewTest.getUserInfo();
            if (checkLogin(userLogin)){
                viewTest.showMessage("Success!!");
                callNext();
                break;
            } else if (count >= 4){
                System.out.println("Sorry, please wait for 10 minutes");
                break;
            }
            else viewTest.showMessage("False, Again!!");

            count ++;
            
        }
    }

    private boolean checkLogin(User userLoginUser){
        if (userLogin.getUsername().equals("admin") && userLogin.getPassword().equals("admin")){
            return true;
        } else return false;
    }


    //Register
    public void register(){
        System.out.println("----------Register----------");
        User user = viewTest.getUserInfo();
        
        while (true){
            if (checkRePassword(user)){
                System.out.println("Success! . Please check mail");
                callFirst();
                break;
            }else System.out.println("Again!!");
            
        }

    }

    private boolean checkRePassword(User user){
        System.out.print("Enter re-password: ");
        if(scanner.next().equals(user.getPassword())) return true;
        else return false;
    }

    // Forgot
    public void forgotPassword(){
        System.out.println("----------Forgot Password----------");
        while(true){
            User user = viewTest.getPassword();
            if(checkUsername(user)){
                System.out.println("Success! . Please check mail");
                callFirst();
                break;
            }else System.out.println("Again!!");
        }
    }

    public boolean checkUsername(User user){
        if (user.getUsername().equals("admin")) return true;
        else return false;
    }

    //Check your balance

    public double checkBalance(){
        return userLogin.getBalance();
    }

    //deposit
    public void reCharge(){
        System.out.print("How much do you deposit?\n$   ");
        userLogin.setBalance(userLogin.getBalance()+scanner.nextDouble());
    }

    // withdraw
    public void withdraw() {
        System.out.print("How much do you withdraw?\n$  ");
        double amount = scanner.nextDouble();
        if (amount <= userLogin.balance) {
            userLogin.balance -= amount;
            System.out.println("Completed withdraw");
        } else System.out.println("amount exceeded");
    }

    //Transfer


    public void transferTo(User another){
        System.out.print("How much do you transfer?\n$  ");
        double amount = scanner.nextDouble();
        if (amount <= userLogin.balance){
            this.userLogin.balance -= amount;
            another.balance += amount;
            System.out.println("Completed transfer");
        } else System.out.println("amount exceeded");
    }
    

    // public View getView(){
    //     return viewTest;
    // }

    // public void setView(View view){
    //     viewTest = view;
    // }




}
