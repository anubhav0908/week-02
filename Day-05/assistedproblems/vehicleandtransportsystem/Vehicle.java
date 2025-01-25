package assistedproblems.vehicleandtransportsystem;

//super class
class Vehicle{
    Double maxSpeed;
    String fueltype;
    String vehicleType;
    //constructor to initialize the variables
    Vehicle(String vehicleType,double maxSpeed,String fueltype){
        this.vehicleType=vehicleType;
        this.maxSpeed=maxSpeed;
        this.fueltype=fueltype;
    }
    //method which will be overridden prior inheritence
    public void displayInfo(){
        System.out.println("VEHICLETYPE: "+vehicleType+ "MAXSPEED "+maxSpeed+" FUELTYPE "+fueltype);
    }
}



