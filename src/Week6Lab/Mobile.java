package Week6Lab;

import java.awt.Color;

public class Mobile {
    private String ownerName;
    private Color color;
    private String number;
    private String model;

    public Mobile() {

    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mobile [ownerName=" + ownerName + ", color=" + color + ", number=" + number + ", model=" + model + "]";
    }

}
