package OOP_Exercise_3;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length-1; i >= 0; i--) {
            sb.append(coeffs[i] + (i != 0 ? "*x^"+i+" + ":""));
        }
        return sb.toString();
    }

    // public double evaluate(double x) {

    // }   
    
}
