package singleinheritence.smarthome;

//class thermostat inherits device
class Thermostat extends Device {
    int temperatureSetting;
    //constructor which is used to initialize variables
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    //method overridden
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting " + temperatureSetting);
    }
}