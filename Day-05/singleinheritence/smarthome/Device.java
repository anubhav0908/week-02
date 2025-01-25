package singleinheritence.smarthome;

//super class
class Device {
    String deviceId;
    String status;
    //constructor which is used to initialize the variables
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    //method overridden`

    void displayStatus() {
        System.out.println("Device id " + deviceId);
        System.out.println("Status " + status);
    }
}
