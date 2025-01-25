package multilevelinheritence.coursesystem;

//base class
class Course {
    String courseName;
    int duration;
    //constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    //method
    void displayInfo() {
        System.out.println("Course Name " + courseName);
        System.out.println("Duration " + duration);
    }
}


