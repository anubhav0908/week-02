package encapsulationandpolymorphism.vehiclerentalsystem;
//subclass Truck which inherits the feature of Vehicle and implements the interface class Insurable
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    //Constructor of truck class
    Truck(String vehicleNumber,String vehicleType,double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber,vehicleType,rentalRate);
        this.insurancePolicyNumber=insurancePolicyNumber;
    }
    //overridden method
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    //overridden method
    public void displayDetails(){
        super.displayDetails();
        System.out.println("insurance policy number: "+insurancePolicyNumber);
    }
    //overridden method
    public double calculateInsurance(){
        return 0.07 * getRentalRate(); // Assuming 7% of rental rate as insurance cost for car
    }
   // overridden method
    public void getInsuranceDetails() {
        System.out.println("Insurance Details: ");
        System.out.println("Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}
