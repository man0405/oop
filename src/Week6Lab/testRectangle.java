package Week6Lab;

public class testRectangle {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 5);
        Point2D p2 = new Point2D(6, 8);
        Rectangle2D r1 = new Rectangle2D(p1, p2);
        System.out.println("Area of rectangle: " + r1.getArea());
        System.out.println("Perimeter of rectangle: " + r1.getPerimeter());
        r1.display();
    }
}
