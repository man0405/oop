package Week5;

import java.util.Scanner;

public class Menu {
    public static Scanner input = new Scanner(System.in);
    public static int enterUserChoice(){
        int choice;
        System.out.println("Press 1: +");
        System.out.println("Press 2: -");
        System.out.println("Press 3: *");
        System.out.println("Press 4: /");
        choice = input.nextInt(); 
        return choice;
    }
}
