package homework9.task1;

public class Book {
    private final String title;
    private final String author;
    private double price;

    // constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public double getPrice() {
        return price;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " ($" + String.format("%.2f",price) + ")";
    }

}