package djawk;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        for (int i = 1 ; i <= height ; i++) {
            for(int j = 1 ; j <= height + 1; j++) {
                if ( (height- j + 1) == i) System.out.print(i);
                else System.out.print(" ");
            }
            for(int j = 1; j <= height; j++){
                if(i == j ) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = height ; i > 0 ; i--) {
            for(int j = 1 ; j <= height + 1; j++) {
                if ( (height- j + 1) == i) System.out.print(i);
                else System.out.print(" ");
            }
            for(int j = 1; j <= height; j++){
                if(i == j ) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }       
    }
}
