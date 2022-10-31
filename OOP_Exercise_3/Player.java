package OOP_Exercise_3;

public class Player {
    private int number;
    private float x, y, z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        z = 0.0f;
    }

    public void move ( float xDisp, float yDisp){
        x += xDisp;
        y += yDisp;
    }

    public void jump ( float zDisp){
        z += zDisp;
    }

    public boolean near (Ball ball){
        double near = Math.sqrt((x-ball.getX())*(x-ball.getX()) + (y-ball.getY())*(y-ball.getY()));
        if (near < 8) return true;
        return false;
    }

    public void kick (Ball ball){
          if( near(ball)) {
                ball.setX(x);
                ball.setY(y);
          }
    }
}
