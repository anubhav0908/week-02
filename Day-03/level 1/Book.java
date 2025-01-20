public class Book {

    // Static variable
    static String libraryName = "Central Library";

    // Instance variables
     String title;
     String author;
    final String isbn;  // final variable

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;  // Final variable
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Using 'instanceof' to check if the object is an instance of Book
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("Java", "Anubhav", "12345678");
        Book book2 = new Book("C++", "deepansh", "12435623");
        Book book3 = new Book("Python", "furquan", "98765433");

        // Display library name
        Book.displayLibraryName();

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

    }
}

