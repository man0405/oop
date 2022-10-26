package OOP_Exercise_4;

public class Point2D {
    private float x, y;

    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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

    public void setXY( float x, float y){
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] results = new float[2];
        results[0] = getX();
        results[1] = getY();
        return results;
    }

    @Override
    public String toString() {
        return "(" + x + y + ")";
    }

    
    
}
