package OOP_Exercise_3;

public class MyDate {
    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 9999;

    private static final int MIN_MONTH =1;
    private static final int MAX_MONTH = 12;

    private int year, month, day;

    private static final String[] MONTHS ={
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };

    private static final String[] DAYS = {
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    };

    private static final int[] daysInMonth = {
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31
    };

    private static final int[] nonLeapYearMonthNumber = {
        0,
        3,
        3,
        6,
        1,
        4,
        6,
        2,
        5,
        0,
        3,
        5
    };

    private static final int[] leapYearMonthNumber = {
        6,
        2,
        3,
        6,
        1,
        4,
        6,
        2,
        5,
        0,
        3,
        5
    };

    public static boolean isLeapYear ( int year){
        return ( year %4 ==0 && year % 100 != 0 ) || ( year % 400 == 0 );
    }

    public static int getMonthLastDay(int year, int month){
        return daysInMonth[month - 1] + (isLeapYear(year) && month == 2 ? 1:0);
    } 

    public static boolean isValidDate (int year, int month, int day){
        return (MIN_YEAR <= year && year <= MAX_YEAR) 
        && (MIN_MONTH <= month && month <= MAX_MONTH)
        && (1 <= day && day <= getMonthLastDay(year, month));
    }

    public static int getDayOfWeek(int year, int month, int day){
        if(! isValidDate(year, month, day)) return -1;
        else {
            // Based on the two digit of year, get the number "century"
            int magicCenturyNumber = 6 - 2*((year / 100)%4); 

            int lastTwoDigitOfYear = (year % 100);

            int magicYearNumber = lastTwoDigitOfYear /4;

            int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumber[month -1] : nonLeapYearMonthNumber[month -1];

            int magicDayNumber = day;

            return (magicCenturyNumber + lastTwoDigitOfYear + magicYearNumber + magicMonthNumber + magicDayNumber)%7;

        }
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > MAX_YEAR || year < MIN_YEAR){
            throw new IllegalArgumentException ("Invalid year");
        } 
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < MIN_MONTH || month > MAX_MONTH){
            throw new IllegalArgumentException ("Invalid month");
        } 
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDay = getMonthLastDay(year,month);
        if (day < 1 || day > maxDay) {
            throw new IllegalArgumentException ("Invalid day");
        }
        this.day = day; 

    }

    @Override
    public String toString() {
        int weekDay = getDayOfWeek(year , month , day);
        return String.format("%1$s %2$d %3$s %4$d", DAYS[weekDay] , day, MONTHS[month -1], year);
    }

    public MyDate nextDay(){
        int maxDay = getMonthLastDay(year,month);
        if (day == maxDay && month == MAX_MONTH && year == MAX_YEAR) return this;

        if  (maxDay == day && MAX_MONTH == month){
            setDate(year + 1,MIN_MONTH,1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month + 1, 1);
        }

        setDate(year, month, day + 1);
        return this;
    }

    public MyDate nextMonth() {
        if (month == MAX_MONTH && year == MAX_YEAR) return this;

        int maxDay = (MAX_MONTH == month) ? getMonthLastDay(year + 1, month) : getMonthLastDay(year,month +1);

        if (maxDay == getMonthLastDay(year, month)) maxDay =maxDay;
        else if (maxDay < day) maxDay = maxDay;
        else if (maxDay > day) maxDay = day;

        if (MAX_MONTH == maxDay){
            setDate(year +1 , month, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear(){
        if (MAX_YEAR == year) return this;

        int maxDay = getMonthLastDay(year+1, month);
        if (maxDay == getMonthLastDay(year, month)) maxDay =maxDay;
        else if (maxDay < day) maxDay = maxDay;
        else if (maxDay > day) maxDay = day;

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (day ==1 && month == MIN_MONTH && year == MIN_MONTH) return this;

        if (day == 1 && month == MIN_MONTH) {
            setDate(year - 1, MAX_MONTH, getMonthLastDay(year -1,MAX_MONTH));
            return this;
        }

        setDate(year, month, day -1);
        return this;
    }

    public MyDate previousMonth() {
        if (month == MIN_MONTH && year == MIN_YEAR) return this;
        
        int maxDay = (MIN_MONTH == month) ? getMonthLastDay(year -1, month) : getMonthLastDay(year,month -1);
        if (maxDay == getMonthLastDay(year, month)) maxDay =maxDay;
        else if (maxDay < day) maxDay = maxDay;
        else if (maxDay > day) maxDay = day;

        if (MIN_MONTH == month){
            setDate(year - 1, month, maxDay);
            return this;
        }

        setDate(year, month -1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (MAX_YEAR == year) return this;

        int maxDay = getMonthLastDay(year - 1, month);
        if (maxDay == getMonthLastDay(year, month)) maxDay =maxDay;
        else if (maxDay < day) maxDay = maxDay;
        else if (maxDay > day) maxDay = day;

        setDate(year + 1, month, maxDay);
        return this;
    }



    
    

        




}
