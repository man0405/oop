package Week3;

public class ex_10 {
    public static void main(String[] args) {
        int n =100;
        int sum = 0;
        for (int i = 1 ; i <= n ; i++) { 
            if ( i % 7 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
