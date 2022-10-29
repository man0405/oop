package Week3;

public class ex_9 {
    public static void main(String[] args) {
        int n =100;
        int max = 1;
        for (int i = 1 ; i <= n ; i++) { 
            if ( i % 7 == 0){
                if ( i > max ) max = i;
            }
        }
        System.out.println(max);
    }
}
