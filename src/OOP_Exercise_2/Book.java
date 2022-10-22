package OOP_Exercise_2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    

    @Override
    public String toString() {
        String authorName = "";
        for(int i = 0; i < authors.length ; i++) {
            authorName += i+1 + ". " + authors[i] + ",";
        }
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + authorName +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }



}
