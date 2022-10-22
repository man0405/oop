package OOP_Exercise_1;

public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;

    public Ball(float x, float y, int radius  ,int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
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
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+= xDelta; y+= yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta +   "," + yDelta + ")]";  
    }




}
