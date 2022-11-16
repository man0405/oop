package Week4;

import java.util.Scanner;


public class multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b ,c ;
        do {
             b = input.nextInt();
             c = input.nextInt();
        } while ( b < 100 || c < 100 || c >999 || b > 999);

        int a  = b*c;
        System.out.println(a);

        int d = Math.multiplyExact(b, c);
        System.out.println(d);

        int e = c%10;
        c = c / 10;
        int e10 = c % 10;
        c = c/ 10;   
        a = b*e + b*10*e10 + b*100*c;
        System.out.println(a);


    }
}
