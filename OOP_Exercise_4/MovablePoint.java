package OOP_Exercise_4;

public class MovablePoint extends Point {
    private float xSpeed, ySpeed;

    public MovablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getXY(){
        return new float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return super.toString() +",speed=(" + xSpeed  + ","+ ySpeed +")";
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
