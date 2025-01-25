package assistedproblems.vehicleandtransportsystem;

//subclass car inherits the class vehicle
class Car extends Vehicle{
    int seatCapacity;
    //constructor of car to initialize the variables
    Car(double maxSpeed,String fuelType,int seatCapacity,String vehicleType){
        super(vehicleType,maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;

    }
    //method overridden
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("SEATCAPACITY "+seatCapacity);
    }
}