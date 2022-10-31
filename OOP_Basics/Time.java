package OOP_Basics;

public class Time {
    private int second, minute, hour;

    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, minute);
    }

    public void setTime(int seconds, int minutes, int hour){
        this.second = seconds;
        this.minute = minutes;
        this.hour = hour;
    }

    public Time nextSecond(){
        ++second;
        if ( second >= 60) {
            second = 0;
            ++minute;
            if ( minute >= 60) {
                minute = 0;
                ++hour;
                if ( hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

}
