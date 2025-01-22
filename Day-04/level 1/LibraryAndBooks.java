import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display Book details
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the " + name + " library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Get the library name
    public String getName() {
        return name;
    }
}
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("Java", "Anubhav Singh");
        Book book2 = new Book("python", "Devesh Yadav");
        Book book3 = new Book("c++", "Aditya tiwari");

        // Create Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);  // book2 is shared across libraries
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();
    }
}
