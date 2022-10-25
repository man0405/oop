package OOP_Exercise_4;

public class Circle {
    private double radius ;
    private String color ;

    public Circle (){
        radius = 1.0;
        color = "red";
    }

    public Circle(double r){
        radius = r;
        color = "red";
    }

    public Circle(double r, String color){
        radius = r;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    public double getArea(){
        return Math.PI *radius *radius ;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}

    

