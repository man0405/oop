package Week3;

public class ex_20 {
    public static void main(String[] args) {
        long number , results;
        number = 6;
        results = factorial(number);
        System.out.println("Factorial of 6 is : " + results);

    }

    public static long factorial (long value) {
        long results = 1;
        for (int i = 2; i <= value; i++){
            results *= i;
        }
        return results;
    }
}
