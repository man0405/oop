package Week4;

import java.util.Scanner;

public class Action  {
    private  User account1 = new User();
    ViewLogin v1 = new ViewLogin();
    Scanner sc = new Scanner(System.in);

    public Action(){

    }

    public  void actionLogin(){
        int count = 0;
        do {
            System.out.println("-------------Login--------------------");
            System.out.print("Enter the number account: ");
            account1.setUsername(sc.nextLine());
            System.out.print("Enter the password: ");
            account1.setPassword(sc.nextLine());
            if (account1.checkAccount()) {
                System.out.println("Login successful");
                break;
            }
            System.out.println("The number account and password are not correct");
            System.out.println("Again !");
            count++;

        } while (!account1.checkAccount() || count < 4);
        if ( count > 3) System.out.println("Login failed!! Byee :)))");
        else v1.view();
    }

    public void actionRegister(){
        System.out.println("-------------Register--------------------");
        System.out.print("Enter the number account: ");
        account1.setUsername(sc.nextLine());
        System.out.print("Enter the password: ");
        account1.setPassword(sc.nextLine());
        System.out.print("Re-Password: ");
        while (!account1.isRePassword(sc.nextLine())){
            System.out.println("Wrong Password");
            System.out.println("Again!");
        }

        System.out.println("Register Success!!");
    }

    public void actionForgotPassword(){
        System.out.println("-------------Forgot password--------------------");
        System.out.print("Enter the number account: ");
        while(!account1.isUsername(sc.nextLine())){
            System.out.println("Your Account is not available");
            System.out.println("Again!");
        }
        System.out.println("Check Mail!!!");
    }

    public void actionCheckBalance(){
        System.out.println(account1.getUsername());
        System.out.println("Your Balance: " + account1.getBalance());
    }

}
