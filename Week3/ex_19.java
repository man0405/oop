package Week3;

public class ex_19 {
    public static void main(String[] args) {
        int a = 1;
        System.out.print(a + ", ");
        for (int i = 0; i < 10 ; i++){
            a = (int)(a + 2*Math.pow(3, i));
            System.out.print(a + ", ");
        }
        
    }
}
