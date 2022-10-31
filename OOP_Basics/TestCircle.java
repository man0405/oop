package OOP_Basics;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1, "blue");
        System.out.println(c1);

        Circle c2 = new Circle(2.2);
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        c1.setRadius(3.3);
        c1.setColor("green");
        System.out.println(c1);
        System.out.println("The radius of the circle is " + c1.getRadius());
        System.out.println("The color of the circle is " + c1.getColor());

        System.out.printf("This area is %2f%n" , c1.getArea());
        System.out.println("This curcumference is %2f%n " + c1.getCircumference());

    }
}
