package OOP_Exercise_4;

import java.util.Arrays;

import OOP_Basics.Point;

public class Test_Ex_4_3 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(3,5, 10);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1.getXYZ()));
    }
}
