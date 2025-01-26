package encapsulationandpolymorphism.vehiclerentalsystem;
//subclass Car which inherits the class Vehicle and implements the interface Insurable
public class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    //constructor of Car class
    Car(String vehicleNumber,String vehicleType,double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber,vehicleType,rentalRate);
        this.insurancePolicyNumber=insurancePolicyNumber;

    }
    //overridden method
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    //overridden mehtod
    public void displayDetails(){
        super.displayDetails();
        System.out.println("insurance policy number: "+insurancePolicyNumber);
    }
    //overridden method
    public double calculateInsurance(){
        return 0.03 * getRentalRate(); // Assuming 3% of rental rate as insurance cost for car
    }
    //overridden method
    public void getInsuranceDetails() {
        System.out.println("Insurance Details: ");
        System.out.println("Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}
