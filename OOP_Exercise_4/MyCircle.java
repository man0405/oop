package OOP_Exercise_4;

public class MyCircle extends Shape {
    private double radius;

    public MyCircle(){
        super();
        radius = 1.0;
    }

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public MyCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle"+ super.toString() +" [radius=" + radius + "]";
    }
}
