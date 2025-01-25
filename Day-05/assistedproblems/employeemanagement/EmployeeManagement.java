package assistedproblems.employeemanagement;

public class EmployeeManagement {
    public static void main(String[] args) {
        //object of employee is created
        Employee e1=new Employee("Anubhav",33,25000);
        //object of employee calls the method
        e1.displayDetails();
        //object of manager is created
        Manager m1=new Manager("deepansh",45,26000,1234);
        //object of manager is used to call the overridden method
        m1.displayDetails();
        //object of developer class is created
        Developer d1=new Developer("purquan",122,27000,"c++");
        //object of developer is used to call the overridden method
        d1.displayDetails();
        //object of intern is created
        Intern i1=new Intern("om",97,28000,"TIT");
        //object of intern is used to call the overridden method
        i1.displayDetails();
    }
}