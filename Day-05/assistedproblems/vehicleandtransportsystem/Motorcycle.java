package assistedproblems.vehicleandtransportsystem;


//class motorcycle inherits the class vehicle
class Motorcycle extends Vehicle{
    boolean diskBreak;
    //constructor to initialize the variables
    Motorcycle(String vehicleType,double maxSpeed,String fuelType,boolean diskBreak){
        super(vehicleType,maxSpeed,fuelType);
        this.diskBreak=diskBreak;
    }
    //method overridden
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("DISKBREAK "+diskBreak);
    }
}