package assistedproblems.employeemanagement;

//subclass who inherits the employee
class Manager extends Employee{
    int teamSize;
    //constructor
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    //method overridden
    public void displayDetails(){
        super.displayDetails();
        System.out.println("teamSize: "+teamSize);
    }
}