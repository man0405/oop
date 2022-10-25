package OOP_Exercise_4;

public class Student extends Person {
    private String program;
    private double fee;
    private int year;

    public Student() {
    }
    public Student(String name, String address, String program, double fee, int year) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return   "Student" + super.toString() + " program=" + program + ", fee=" + fee + ", year=" + year + "]";
    }
}
