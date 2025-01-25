package assistedproblems.employeemanagement;

//subclass which inherits the employee class
class Intern extends Employee{
    String college;
    //constructor
    Intern(String name,int id, double salary,String college){
        super(name, id, salary);
        this.college=college;
    }
    //overridden method
    public void displayDetails(){
        super.displayDetails();
        System.out.println("college "+college);
    }
}
