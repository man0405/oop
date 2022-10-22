package OOP_Exercise_1;


public class testCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1.3);
        System.out.println(c1);
        System.out.println(c2);

        c1.setRadius(3.1);
        c1.setColor("aqua");
        System.out.println(c1);
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
    
}
