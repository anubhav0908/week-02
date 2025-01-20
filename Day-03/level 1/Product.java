public class Product {

    static double discount = 10.0;

    // Instance variables
     String productName;
     double price;
     int quantity;
     final int productID;

    // Constructor to initialize product details using 'this'
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;  // Update the static discount variable
    }

    // Method to display product details
    public void displayProductDetails() {
        // Check if the current object is an instance of Product
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double finalPrice = price - (price * discount / 100);
            System.out.println("Price after discount: $" + finalPrice);
        }
    }

    public static void main(String[] args) {
        // Create product objects
        Product product1 = new Product("Laptop", 1200.0, 2, 101);
        Product product2 = new Product("Smartphone", 800.0, 3, 102);
        Product product3 = new Product("Headphones", 150.0, 5, 103);

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Update discount
        Product.updateDiscount(15.0);  // Set discount to 15%

        System.out.println("\nAfter updating the discount:");

        // Display product details again after updating discount
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
    }
}

