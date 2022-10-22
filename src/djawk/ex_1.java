package djawk;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        for (int i = 1; i <= height; i++) {
            for(int j = 1; j < height; j++){
                if((j+i) == (height+1)) System.out.print("*");
                else System.out.print("#");
            }
            for(int j = height ; j <= 2*height - 1 ; j++){
                if((j+1 - height) == i) System.out.print("*");
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}
