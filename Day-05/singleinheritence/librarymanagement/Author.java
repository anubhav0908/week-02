package singleinheritence.librarymanagement;

//class author inherits the class book
class Author extends Book {
    String name;
    String bio;
    //constructor to initialize the variables
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    //method overridden
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}