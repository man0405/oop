package OOP_Exercise_4;

public class MyRectangle extends Shape {
    private double width, height;

    public MyRectangle(){
        width = 0.0;
        height = 0.0;
    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }

    @Override
    public String toString() {
        return "Rectangle "+super.toString()+" [width=" + width + ", height=" + height + "]";
    }
}
