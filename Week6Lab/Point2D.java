package Week6Lab;

public class Point2D {
    private float x, y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distance(Point2D A) {
        return Math.sqrt(Math.pow(this.x - A.x, 2) + Math.pow(this.y - A.y, 2));
    }

    public void display() {
        System.out.println("(" + x + "," + y + ")");
    }

}
