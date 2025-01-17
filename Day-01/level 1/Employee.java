class Employee {
     String name;
     int id;
     double salary;
    // Constructor to initialize the Employee object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary:" + String.format("%.2f", salary));
    }
    public static void main(String[] args) {
        // Create an employee object
        Employee emp = new Employee("Anubhav singh", 33, 30000.00);
        // Display the employe's details
        emp.displayDetails();
    }
}
