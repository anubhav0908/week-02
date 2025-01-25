package hierarchicalinheritance.schoolsystem;

//super class
class Person {
    String name;
    int age;
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method
    public void displayRole() {
        System.out.println(this.name + " is a person.");
    }
}

