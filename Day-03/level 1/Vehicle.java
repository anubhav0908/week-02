public class Vehicle {

    // Static variable shared by all instances of the Vehicle class
    static double registrationFee = 100.0;  // Common registration fee for all vehicles

    // Instance variables
     String ownerName;
     String vehicleType;
     final String registrationNumber;  // Final variable
    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;  // Update the static registration fee
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        // Check if the current object is an instance of Vehicle
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Anubhav Singh", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Deepansh Khare", "Motorcycle", "XYZ789");
        Vehicle vehicle3 = new Vehicle("Furquan Majeed", "Truck", "LMN456");

        // Display vehicle registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
        vehicle3.displayRegistrationDetails();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);

        System.out.println("\nAfter updating the registration fee:");

        // Display vehicle registration details again after updating the fee
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
        vehicle3.displayRegistrationDetails();


    }
}
