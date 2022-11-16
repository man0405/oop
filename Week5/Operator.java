package Week5;

import javax.swing.SwingConstants;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.ElasticCharAppender;

public class Operator {
    private int number1;
    private int number2;
    private String operator;

    public Operator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Operator() {
    }

    public Operator(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    double rs;
    public double cal(String opt){
        switch (opt) {
            case "+":
                rs = number1 + number2;
                break;
            case "-":
                rs = number1 - number2;
                break;
            case "*":
                rs = number1 * number2;
                break;
            case "/":
                if (number2 == 0 ) rs = Integer.MIN_VALUE;
                else rs = number1 / number2;
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        return rs;
    }

    @Override
    public String toString() {
        return "Operator [number1=" + number1 + ", number2=" + number2 + ", operator=" + operator + "]";
    }


    
    
}


