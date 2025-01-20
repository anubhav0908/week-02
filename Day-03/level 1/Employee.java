public class Employee {

    // Static variable shared by all instances of Employee class
    static String companyName = "Bridge Lab";
     static int totalEmployees = 0;  // Static variable to count total employees

    // Instance variables
     String name;
     final int id;
     String designation;

    // Constructor to initialize name, id, and designation using 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // Check if the current object is an instance of the Employee class
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);

        }
    }

    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Anubhav singh", 101, "Software Engineer");
        Employee emp2 = new Employee("Deepansh khare", 102, "Project Manager");
        Employee emp3 = new Employee("furquan majeed", 103, "HR ");

        // Display total number of employees
        Employee.displayTotalEmployees();

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();


    }
}
