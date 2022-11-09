package Week5;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private String code, description;
    private double price ;

    public Product() {
    }


    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        return currency.format(price); 
    }

    @Override
    public String toString() {
        return "code=" + code + "\nDescription=" + description + "\nPrice=" + this.getFormattedPrice() + "\n";
    }
}
