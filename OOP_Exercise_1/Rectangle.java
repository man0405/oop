package OOP_Exercise_1;

public class Rectangle {
    private float height;
    private float width;

    public Rectangle(){
        height = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    public float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2*(height + width);
    }

    public String toString(){
        return "Rectangle[length=" + height + ", width=" + width + "]";
    }


}
