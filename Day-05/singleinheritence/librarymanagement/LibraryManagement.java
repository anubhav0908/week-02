package singleinheritence.librarymanagement;

//main class
public class LibraryManagement {
    public static void main(String[] args) {
        //object of author is created which is used to call displayinfo method
        Author author = new Author("java", 1999, "Anubhav Singh", "Be a Programmer.");
        author.displayInfo();
    }
}