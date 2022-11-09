package Week4;

import java.util.Scanner;

public class Bank{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User admin01 = new User();
        Action ac1 = new Action();

        System.out.println("-------------Welcom to Bank --------------------");
        System.out.println("Enter the choice number : \n"
                            +"1.Login \n"
                            +"2.Register \n"
                            +"3.Forgot password"                    
        );
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                ac1.actionLogin();  
                break;
            
            case 2:
                ac1.actionRegister();
                break;
            
            case 3:
                ac1.actionForgotPassword();
                break;
        }

    }

}
