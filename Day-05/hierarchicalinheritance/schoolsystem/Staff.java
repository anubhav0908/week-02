package hierarchicalinheritance.schoolsystem;


//class staff inherits the feature of class person
class Staff extends Person {
    String position;
    //constructor
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
    //overridden method
    @Override
    public void displayRole() {
        System.out.println(this.name + " is a staff member with the position of " + this.position + ".");
    }
}