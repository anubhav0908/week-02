class Book {
     String title;
     String author;
     double price;
    // Constructor 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method to test the Book class
     public static void main(String[] args) {
        
        Book book = new Book("Capgemini", "Anubhav Singh", 1500);
        book.displayDetails();
    }
}