package hierarchicalinheritance.schoolsystem;

//class teacher inherits the class person
class Teacher extends Person {
    String subject;
    //constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //overridden method
    @Override
    public void displayRole() {
        System.out.println(this.name + " is a teacher who teaches " + this.subject + ".");
    }
}