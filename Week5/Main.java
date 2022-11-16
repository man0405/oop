package Week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operator o1 = new Operator(input.nextInt(),input.nextInt());
        double result;
        while (true) {
            int us = Menu.enterUserChoice();
            switch (us) {
                case 1:
                    result = o1.cal("+");
                    System.out.println("result = "+result);
                    break;
                case 2:
                    result = o1.cal("-");
                    System.out.println("result = "+result);
                    break;
                case 3:
                    result = o1.cal("*");
                    System.out.println("result = "+result);
                    break;
                case 4:
                    result = o1.cal("/");
                    System.out.println("result = "+result);
                    break;
                case 5:
                    return;
                default:
                    throw new AssertionError();
            }
    
        }

    }
}
