package encapsulationandpolymorphism.ecommerceplatform;


// Main class to test the system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating product objects
        Electronics electronicProduct = new Electronics(101, "Laptop", 1200, 20);  // 10% discount
        Clothing clothingProduct = new Clothing(102, "T-Shirt", 30, 20);  // 20% discount
        Groceries groceryProduct = new Groceries(103, "Apple", 5, 5);  // 5% discount

        // Adding products to an array
        Product[] products = {electronicProduct, clothingProduct, groceryProduct};

        // Displaying product details and final prices
        for (Product product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}
