package assistedproblems.employeemanagement;

//super class
class Employee{
    String name;
    int id;
    double salary;
    //constructor
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //method to display the details which will be overridden
    public void displayDetails(){
        System.out.println("Name: "+name+" id: "+id+" Salary: "+salary);
    }
}



