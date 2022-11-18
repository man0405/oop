package Week6Lab;

public class Salary {
    private double sum, tax;
    private int month;

    public Salary() {
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Salary [sum=" + sum + ", tax=" + tax + ", month=" + month + "]";
    }

}
