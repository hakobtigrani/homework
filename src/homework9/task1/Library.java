package homework9.task1;

public class Library {
    protected String libraryName;
    private Book[] books;
    private int count;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.count = 0;
        this.books = new Book[10];
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
        else {
            System.out.println("Bro the library is full, sorry can't add no more");
        }
    }
    void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + books[i]);
        }
        System.out.println();
    }

    public Book[] getBooks(){
        return books;
    }
}


