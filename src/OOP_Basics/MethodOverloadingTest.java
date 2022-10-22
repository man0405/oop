package OOP_Basics;

public class MethodOverloadingTest {
    public static int average(int n1, int n2) {
        System.out.println("Version 1");
        return (n1 + n2) / 2;        
    }

    public static double average(double n1, double n2) {
        System.out.println("Version 2");
        return (n1 + n2) / 2;
    }

    public static int average(int n1, int n2, int n3) {
        System.out.println("Version 3");
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        System.out.println(average(1, 2));
        System.out.println(average(1.0, 2.0));
        System.out.println(average(1, 2, 3));
        System.out.println(average(1.0, 2));
    }
}
