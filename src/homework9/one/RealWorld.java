package homework9.one;

public class RealWorld {
    public static void main(String[] args) {
        Book book1 = new Book("Alfredo", "The Alchemist", 29);
        Book book2 = new Book("Antiphon", "Alfa Mist", 19);
        Book book3 = new Book("The Eternal Attack", "Symere Woods", 25);
        Book book4 = new Book("Spontan", "Siranush Danieyan", 15);
        Book book5 = new Book("The Garage", "Ara", 25);

        Library library1 = new Library("Jackal Library");
        Library library2 = new Library("Jack's Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);

        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book3);

        library1.showBooks();
        library2.showBooks();

        System.out.println("Inflation!!!");

        book1.setPrice(book1.getPrice()*1.1);
        book2.setPrice(book2.getPrice()*1.1);
        book3.setPrice(book3.getPrice()*1.1);
        book4.setPrice(book4.getPrice()*1.1);
        book5.setPrice(book5.getPrice()*1.1);

        library1.showBooks();
        library2.showBooks();
    }
}
