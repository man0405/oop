package Bank;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Controller {
    Scanner scanner = new Scanner(System.in);
    static User user = new User();
    User testTranfer = new User();
    private View viewTest;
    private ArrayList<User> arrayList = new ArrayList<User>();
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
                // System.out.println("Exit");
                checkArrays();
                break;
        }
    }

    public void callNext(){
        System.out.println("----------Hello, "+user.getUsername()+"----------");
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
            user = viewTest.getUserInfo();
            if (checkLogin(user)){
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
        // if (userLogin.getUsername().equals("admin") && userLogin.getPassword().equals("admin")){
        //     return true;
        // } else return false;

        for( User a : arrayList){
            if ( a.getUsername().equals(userLoginUser.getUsername()) && a.getPassword().equals(userLoginUser.getPassword())){
                return true;
            }
        }return false;

    }


    //Register
    public void register(){
        System.out.println("----------Register----------");

        while(true){
            user = viewTest.getUserInfo();
            if(checkExistUser(user)) break;
            System.out.println("User is exist ! Again!!");
        }
        arrayList.add(user);
        
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
        String rePassword = scanner.next();
        for (User a : arrayList) {
            if(rePassword.equals(a.getPassword())) return true;
        }
        return false;
    }

    private boolean checkExistUser(User user){
        for (User a : arrayList) {
            if(a.getUsername().equalsIgnoreCase(user.getUsername())) return false;
        }
        return true;
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
        for (User a : arrayList) {
            if (user.getUsername().equals(a.getUsername())) return true;
        }
        return false;
    }

    //Check your balance

    public double checkBalance(){
        return user.getBalance();
    }

    //deposit
    public void reCharge(){
        System.out.print("How much do you deposit?\n$   ");
        user.setBalance(user.getBalance()+scanner.nextDouble());
    }

    // withdraw
    public void withdraw() {
        System.out.print("How much do you withdraw?\n$  ");
        double amount = scanner.nextDouble();
        if (amount <= user.balance) {
            user.balance -= amount;
            System.out.println("Completed withdraw");
        } else System.out.println("amount exceeded");
    }

    //Transfer
    public void transferTo(User another){
        System.out.print("How much do you transfer?\n$  ");
        double amount = scanner.nextDouble();
        if (amount <= user.balance){
            user.balance -= amount;
            another.balance += amount;
            System.out.println("Completed transfer");
        } else System.out.println("amount exceeded");
    }


    
    public void checkArrays(){
        for (User a : arrayList) {
            System.out.println(a);
        }
    }
    // public View getView(){
    //     return viewTest;
    // }

    // public void setView(View view){
    //     viewTest = view;
    // }




}