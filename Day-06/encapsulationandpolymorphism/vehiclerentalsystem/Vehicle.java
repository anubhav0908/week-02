package encapsulationandpolymorphism.vehiclerentalsystem;
//abstract clas vehicle
abstract class Vehicle{
    private String vehicleNumber;
    private String vehicleType;
    private Double rentalRate;
//abstract method
  public abstract double calculateRentalCost(int days);
//constructor of vehicle
  Vehicle(String vehicleNumber,String vehicleType,double rentalRate){
      this.vehicleNumber=vehicleNumber;
      this.vehicleType=vehicleType;
      this.rentalRate=rentalRate;
  }
    //Getters for Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    //method to display the details
    public void displayDetails(){
        System.out.println("vehicle number: "+vehicleNumber);
        System.out.println("vehicle type: "+vehicleType);
        System.out.println("rental rate: "+rentalRate);
    }
}