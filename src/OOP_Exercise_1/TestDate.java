package OOP_Exercise_1;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(16,07,2002);
        System.out.println(d1);

        d1.setDate(18 , 11, 1900);
        System.out.println(d1);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
    }
}
