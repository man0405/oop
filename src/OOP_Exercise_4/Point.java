package OOP_Exercise_4;

public class Point {
        private float x, y;
        
        public Point(){
            x = 0.0f;
            y = 0.0f;
        }

        public Point(float x, float y) {
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

        
        public void setXY(float x, float y) {
            setX(x);
            setY(y);
        }

        public float[] getXY(){
            return new float[]{getX(), getY()};
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

        

}
