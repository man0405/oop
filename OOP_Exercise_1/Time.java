package OOP_Exercise_1;

public class Time {
    private int hour, minute, second;


    // public void setSecond(int second) {
    //     if(second >= 0 && second <= 60) this.second = second;
    //     else System.out.println("No input valition needed");
    // }

    // public void setMinute(int minute) {
    //     if(minute >= 0 && minute <= 60) this.minute = minute;
    //     else System.out.println("No input valition needed");  
    // }

    // public void setHour(int hour) {
    //     if(hour >= 0 && hour <= 24) this.hour = hour;
    //     else System.out.println("No input valition needed");      
    // }

    // public void setTime(int second, int minute, int hour) {
    //     this.setSecond(second);
    //     this.setHour(hour);
    //     this.setMinute(minute);
    // }


    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int second, int minute, int hour){
        this.setTime(second, minute, hour);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond(){
        ++second;
        if(second >=60){
            second = 0;
            ++minute;
            if(minute >= 60){
                minute = 0;
                ++hour;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        --second;
        if(second <= 0){
            second = 59;
            --minute;
            if(minute <= 0){
                minute = 59;
                --hour;
                if(hour <= 0){
                    hour = 23;
                }
            }

        } 
        return this;
    }
}
