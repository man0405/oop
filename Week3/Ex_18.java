package Week3;

public class Ex_18 {

    static final int DEGREE = 6;
    static final int[] x_init ={0,1,2,3,4,5};
    static final int[] y_init ={1,7,16,37,79,173};

    static double cal_f(double x){
        double f = 0;
        for (int i = 1; i < DEGREE ; i++){
            double L = 1;
            for (int j = 0; j < i; j++){
                if (j!=i) L *=(x- x_init[j])/(x_init[i] - x_init[j]);
            }
            f += L*y_init[i];
        }
        return f;
    }

    public static void main(String[] args) {
        final int NUMBER_TERMS = 25;
        double[] a = new double[NUMBER_TERMS];
        for (int i = 0; i < NUMBER_TERMS; i++)
            a[i] = y_init[i];
        for (int i = DEGREE; i < NUMBER_TERMS; i++)
            a[i] = cal_f(i);
        for (int i = 0; i < NUMBER_TERMS; i++){
            System.out.println(a[i]);
        }
    }
}
