package OOP_Exercise_2;

public class MyRectangle_2_6 {
    MyPoint top_right = new MyPoint();
    MyPoint bottom_left = new MyPoint();

    public MyRectangle_2_6(int x1,int y1,int x2,int y2){
        top_right.setXY(x1, y1);
        bottom_left.setXY(x2, y2);
    }

    MyPoint top_left = new MyPoint (top_right.getX(), bottom_left.getY());
    MyPoint bottom_right = new MyPoint (bottom_left.getX(), top_left.getY());

    public double getArea(){
        return top_right.distance(bottom_right) * bottom_right.distance(bottom_left);
    }

    public double getPerimeter(){
        return (top_right.distance(bottom_right) + top_left.distance(bottom_left))*2;
    }


}
