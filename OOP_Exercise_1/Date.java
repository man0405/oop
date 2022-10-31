package OOP_Exercise_1;

public class Date {
    private int day, month, year;

    public void setDay(int day) {
        if (day >=1 && day <= 31) {
            this.day = day;
        } else throw new IllegalArgumentException("No input valition needed" );
    }

    public void setMonth(int month) {
        if( month >=1 && month <= 12) this.month = month;
        else throw new IllegalArgumentException("No input valition needed" );
    }

    public void setYear(int year) {
        if (year >=1900 && year <= 9999) this.year = year;
        else throw new IllegalArgumentException("No input valition needed" );
    }

    public void setDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public Date(int day, int month, int year){
        this.setDate(day, month, year);
    }      
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%02d/%02d/%04d", month,day ,year);
    }
}
