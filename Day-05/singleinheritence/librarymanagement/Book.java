package singleinheritence.librarymanagement;

//super class
class Book {
    String title;
    int publicationYear;
    //constructor to initialize the variables
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    //method which will be overridden
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

