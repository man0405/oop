package Week6Lab;

import java.awt.Color;

public class Circle2D {
    private double radius;
    Color color;
    Point2D center;

    public Circle2D(double radius, Color color, Point2D center) {
        this.radius = radius;
        this.color = color;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle2D [radius=" + radius + ", color=" + color + ", center=" + center + "]";
    }

}
