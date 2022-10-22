package OOP_Exercise_1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(3.5f, 6.5f);
        System.out.println(r2);

        r1.setHeight(3.7f);
        r1.setWidth(3.8f);
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
