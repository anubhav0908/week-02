package assistedproblems.vehicleandtransportsystem;

//class truck inherits vehicle
class Truck extends Vehicle{
    double loadCapacity;
    //constructor to initialize the variables
    Truck(String vehicleType,double maxSpeed, String fuelType, double loadCapacity){
        super(vehicleType,maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    //method overridden
    public void displayInfo(){
        super.displayInfo();
        System.out.println("LOADCAPACITY "+loadCapacity);
    }
}