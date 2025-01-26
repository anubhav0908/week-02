package encapsulationandpolymorphism.vehiclerentalsystem;
//main mehtod
public class VehicleRentalSystem {
    public static void main(String[] args) {
        //array with the objects of car, bike and truck
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Bike("v01","Bike",15,"INSR001");
        vehicles[1]=new Car("v02","Car",20,"INSR02");
        vehicles[2]=new Truck("v03","Truck",30,"INSR03");
        //displaying the information of each object
        for(Vehicle vehicle:vehicles){
            vehicle.displayDetails();
            System.out.println("rental cost for 5 days: "+vehicle.calculateRentalCost(5));
            if(vehicle instanceof Insurable){
                Insurable insurable=(Insurable) vehicle;
                insurable.getInsuranceDetails();
                System.out.println();
            }
        }
    }
}
