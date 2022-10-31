package OOP_Exercise_3;

public class MyTime {
    private int hour , minute , second;

    public MyTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Invalid hour: ");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <0 ||  minute >59){
            throw new IllegalArgumentException("Invalid minute: ");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 ||  second > 59){
            throw new IllegalArgumentException("Invalid second: ");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour , minute , second);
    }

    public MyTime nextSecond(){
        try {
            setTime(hour, minute, ++second);
            return this;
        } catch (IllegalArgumentException e) {
            second = 0;
            return nextMinute();
        }
    }

    public MyTime nextMinute(){
        try {
            setTime(++hour, minute,second);
            return this;
        } catch (IllegalArgumentException e) {
            hour = 0;
            return nextHour();
        }
    }

    public MyTime nextHour(){
        try {
            setTime(++hour, minute, second);
            return this;
        } catch (IllegalArgumentException e) {
            hour = 0;
            return this;
        }
    }

    public MyTime previousSecond(){
        try {
            setTime(hour, minute, --second);
            return this;
            } catch (IllegalArgumentException e) {
            second = 0;
            return previousMinute();
            }
    }

    public MyTime previousMinute(){
        try {
            setTime(hour ,--minute , second);
            return this;
            } catch (IllegalArgumentException e) {
            minute = 0;
            return previousHour();
            }
        
    }
    
    public MyTime previousHour(){
        try {
            setTime(--hour, minute, second);
            return this;
            } catch (IllegalArgumentException e) {
            hour = 0;
            return this;
            }
        }
    
}
