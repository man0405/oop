package Week6Lab;

public class Rectangle2D {
    private Point2D bottomLeft = new Point2D();
    private Point2D topRight = new Point2D();
    private Point2D bottomRight = new Point2D();
    private Point2D topLeft = new Point2D();

    public Rectangle2D() {
    }

    public Rectangle2D(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point2D getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point2D bottomRight) {
        this.bottomRight.setX(topRight.getX());
        this.bottomRight.setY(bottomLeft.getY());
    }

    public Point2D getTopRight() {
        return topRight;
    }

    public void setTopRight(Point2D topRight) {
        this.topRight = topRight;
    }

    public Point2D getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point2D topLeft) {
        this.topLeft.setX(bottomLeft.getX());
        this.topLeft.setY(topRight.getY());
    }

    public Point2D getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point2D bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public double getArea() {
        return topLeft.distance(bottomLeft) * bottomLeft.distance(bottomRight);
    }

    public double getPerimeter() {
        return (topLeft.distance(bottomLeft) + bottomLeft.distance(bottomRight)) * 2;
    }

    public void display() {
        System.out.println("Top-Right Rectangle2D: ");
        topRight.display();
        System.out.println("Top-Left Rectangle2D: ");
        topLeft.display();
        System.out.println("Bottom-Left Rectangle2D: ");
        bottomLeft.display();
        System.out.println("Bottom-Right Rectangle2D: ");
        bottomRight.display();
    }

}
