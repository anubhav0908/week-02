package assistedproblems.vehicleandtransportsystem;

//main class
public class VehicleandTransportSystem {
    public static void main(String[] args) {
        //an array of vehicles is created where we store the objects of car, truck and motorcycle
        Vehicle[] vehicle=new Vehicle[3];
        vehicle[0]=new Car(100,"diesel",102,"car ");
        vehicle[1]=new Truck("truck ",70,"electric",202);
        vehicle[2]=new Motorcycle("motorcycle ",180,"petrol",true);
        for(int i=0;i<vehicle.length;i++){
            vehicle[i].displayInfo();

        }
    }
}