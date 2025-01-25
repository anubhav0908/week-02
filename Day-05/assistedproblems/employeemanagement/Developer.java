package assistedproblems.employeemanagement;

//subclass which inherits the feature of superclass
class Developer extends Employee{
    String programmingLanguage;
    //constructor
    Developer(String name,int id,double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    //method overridden
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("programming language: "+programmingLanguage);
    }
}