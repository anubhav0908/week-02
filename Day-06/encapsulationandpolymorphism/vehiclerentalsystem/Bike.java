package encapsulationandpolymorphism.vehiclerentalsystem;
//subclass  which inherits the vehicle class and implements the interface Insurable
public class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    //constructor of Bike class
    Bike(String vehicleNumber,String vehicleType,double rentalRate,String insurancePolicyNumber){
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
        return 0.05 * getRentalRate(); // Assuming 5% of rental rate as insurance cost for car
    }
    //overridden method
    public void getInsuranceDetails() {
        System.out.println("Insurance Details: ");
        System.out.println("Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}
