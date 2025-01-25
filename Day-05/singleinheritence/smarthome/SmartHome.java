package singleinheritence.smarthome;


//main method
public class SmartHome {
    public static void main(String[] args) {
        //object od device class is created which is used to call the method
        Device device = new Device("Device1", "Active");
        //object of thermostat class is created which is used to call the method
        Thermostat thermostat = new Thermostat("Thermostat1", "Active", 22);

        device.displayStatus();
        thermostat.displayStatus();
    }
}