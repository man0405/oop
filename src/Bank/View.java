package Bank;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String message){
        System.out.println(message);
    }

    public int choiceFirst(){
        System.out.println("----------Welcome to Bank----------");
        System.out.println("Please enter (1-3)\n" 
                            + "1.Login\n"
                            + "2.Register\n"
                            + "3.Forgot Password\n"
                            + "4.Exit"
        );

        int choice = scanner.nextInt();
        return choice;
    }

    public int choiceNext(){
        System.out.println("----------Hello----------");
        System.out.println("Please enter (1-5)\n" 
                            + "1.Check your balance\n"
                            + "2.Recharge\n"
                            + "3.WithDraw\n"
                            + "4.Transfer\n"
                            + "5.Exit"
        );
        int choice = scanner.nextInt();
        return choice;
    }

    public User getUserInfo(){
        User userTest = new User();
        System.out.print("Enter username: ");
        userTest.setUsername(scanner.next());
        System.out.print("Enter password: ");
        userTest.setPassword(scanner.next());
        return userTest;
    } 

    public User getPassword(){
        User userTest = new User();
        System.out.print("Enter username: ");
        userTest.setUsername(scanner.next());
        return userTest;
    }
    
}
