package hierarchicalinheritance.schoolsystem;


//main class
public class SchoolSystem {
    public static void main(String[] args) {
        //object of person class
        Person person = new Person("ABC", 25);
        //object of teacher class
        Teacher teacher = new Teacher("Deepansh", 22, "Math");
        //object of student class
        Student student = new Student("Anubhav", 18, 12);
        //object of staff class
        Staff staff = new Staff("Staff 1", 30, "Developer");
        //object of person class is used to call method
        person.displayRole();
        System.out.println();
        //object of teacher class to call the overridden method i.e. display role
        teacher.displayRole();
        System.out.println();
        //object of student class to call the overridden method i.e. display role
        student.displayRole();
        System.out.println();
        //object of staff class to call the overridden method i.e. display role
        staff.displayRole();
    }
}
