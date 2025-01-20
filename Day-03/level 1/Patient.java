public class Patient {
    static String hospitalName = "Ramansh Hospital";
    private static int totalPatients = 0;  // Static variable

     String name;
     int age;
     String ailment;
     final int patientID;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        // Check if the current object is an instance of Patient
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        // Create  objects
        Patient patient1 = new Patient("Anubhav Singh", 20, "Flu", 101);
        Patient patient2 = new Patient("Deepansh Khare", 23, "Back Pain", 102);
        Patient patient3 = new Patient("Furquan Majeed", 22, "Diabetes", 103);

        // Display total number of patients
        Patient.getTotalPatients();

        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        patient3.displayPatientDetails();


    }
}
