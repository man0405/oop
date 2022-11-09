package Week3;

public class ex_support {
    
    // public ex_7_1support() {
    // }
    public static int sum(int n){
        if ( n == 1 ) return 1;
        return n + sum(n-1);
    }

    private static int count = 0;
    public static String convert8(int n){
        if ( n == 0 ){
            if(count == 0) return "0";
            else return "";
        }
        count++;
        return convert8(n/8) + n%8;
    }

}
