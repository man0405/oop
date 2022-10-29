package Week3;

public class ex_support {
    
    // public ex_7_1support() {
    // }
    public static int sum(int n){
        if ( n == 1 ) return 1;
        return n + sum(n-1);
    }

}
