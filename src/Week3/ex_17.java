package Week3;

public class ex_17 {
    public static void main(String[] args) {
        int a = 1;
        System.out.print(a + ", ");
        for (int i = 1; i < 10 ; i ++){
            a = (int) (a + Math.pow(2, i));
            System.out.print(a + ", ");
        }
    }
}
