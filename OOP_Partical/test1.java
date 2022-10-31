package OOP_Partical;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            a = a + b;
            b = a - b;
            a = a - a;
            System.out.println(a);
            System.out.println(b);
    }
}
