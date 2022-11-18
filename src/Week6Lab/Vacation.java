package Week6Lab;

import java.sql.Date;

public class Vacation {
    private int length;
    private Date date;
    private String place;

    public Vacation() {
    }

    public Vacation(int length, Date date, String place) {
        this.length = length;
        this.date = date;
        this.place = place;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
