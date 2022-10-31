package OOP_Exercise_4;

public class Square extends MyRectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setWidth( double side ){
        super.setWidth(side);
    }

    public void setHeight( double side ){
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square ["+ super.toString() +"]";
    }

    


}
