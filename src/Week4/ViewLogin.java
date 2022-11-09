package Week4;

import java.util.Scanner;

public class ViewLogin extends Action{
    private User u1 = new User();

    private  int choiceNumber;
    private  Scanner sc = new Scanner(System.in);

    public ViewLogin() {
    }

    public void view(){
        System.out.println("Hello, " + u1.getUsername());
        System.out.println("Enter your choice number:\n"
                            + "1.Check your balance\n"
                            + "2.Withdraw\n"
                            + "3.Transfer"  
                            + "4.Recharge"
                            + "5.Exit"
        );
        choiceNumber = sc.nextInt();
        switch(choiceNumber){
            case 1: 
                actionCheckBalance();
                break;
            case 2:
                System.out.println("---------------- Withdraw -----------------");
                break;
            case 3:
                System.out.println("---------------- Transfer -----------------");
                break;
            case 4:
                System.out.println("---------------- Recharge -----------------");
                break;
            case 5:
                System.out.println("Bye!!");

        }
        if (choiceNumber != 5) view();

    }

}
