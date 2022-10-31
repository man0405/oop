package OOP_Exercise_3;

public class container {
    private int x1, y1, x2, y2;

    public container (int x1, int y1, int height, int width) {
        this.x1 = x1;
        this.y1 = y1;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public boolean collides( Ball ball){
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if(ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2){
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    public String toString() {
        return "Container at ("+ x1 +","+ y1 +") to ("+ x2 +", "+ y2 +")";
    }


}
