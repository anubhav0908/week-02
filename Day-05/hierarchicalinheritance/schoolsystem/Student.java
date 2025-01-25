package hierarchicalinheritance.schoolsystem;

//class student inherits the class person
class Student extends Person {
    int grade;
    //constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    //overridden method
    @Override
    public void displayRole() {
        System.out.println(this.name + " is a student in grade " + this.grade + ".");
    }
}