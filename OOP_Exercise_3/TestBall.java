package OOP_Exercise_3;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        container box = new container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
        ball.move();
        box.collides(ball);
        System.out.println(ball); // manual check the position of the ball
        }
    }
}
