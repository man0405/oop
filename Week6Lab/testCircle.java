package Week6Lab;

import java.awt.Color;

public class testCircle {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 5);
        Circle2D c1 = new Circle2D(34.4, Color.black, p1);
        System.out.println(c1);
    }
}
