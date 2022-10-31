package OOP_Exercise_3;

public class MyComplex {
    private double real, imag;

    public MyComplex(){
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal(){
        return (imag == 0);
    }

    public boolean isImag(){
        return (real == 0);
    }

    public boolean equals(double real , double imag){
        return (real == this.real && imag == this.imag);
    }

    public boolean equals(MyComplex myComplex){
        return (myComplex.real == this.real && myComplex.imag == this.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    
    public double arguments() {
        return Math.atan2(imag, real);
    }

    public MyComplex add ( MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex addNew ( MyComplex right){
        MyComplex addNew;
        return addNew = new MyComplex(real + right.getReal(),imag + right.getImag());
    }

    public MyComplex subtract ( MyComplex right ){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex subtractNew ( MyComplex right ){
        MyComplex addNew;
        return addNew = new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiplyWith(MyComplex right) {
        //(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        real = real*right.getReal() - imag*right.getImag();
        imag = real*right.getImag() + imag*right.getReal();
        return this;
    }

    public MyComplex divideBy(MyComplex right) {
        // (a + bi) / (c + di) = [(a + bi) * (c – di)] / (c*c + d*d)
        MyComplex tmp = multiplyWith(right.conjugate());
        double delimiter = right.getReal()*right.getReal() + right.getImag()*right.getImag();
        if (delimiter != 0) {
            real = tmp.getReal() / delimiter;
            imag = tmp.getImag() / delimiter;
        }
        return this;
    }
    
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
    
    
    


}
