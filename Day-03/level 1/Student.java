public class Student {

    // Static variable shared by all instances of Student class
    static String universityName = "RGPV";
     static int totalStudents = 0;  // Static variable to count total students

    // Instance variables
    String name;
     final int rollNumber;  // Final variable to ensure roll number cannot be changed
     String grade;

    // Constructor to initialize name, rollNumber, and grade using 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        // Check if the current object is an instance of Student
        if (this instanceof Student) {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    // Method to update the student's grade
    public void updateGrade(String newGrade) {
        // Check if the current object is an instance of Student before updating the grade
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        }
    }

    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Anubhav singh", 101, "A");
        Student student2 = new Student("Deepansh khare", 102, "B");
        Student student3 = new Student("Furquan Majeed", 103, "A");

        // Display total number of students
        Student.displayTotalStudents();  // Output: Total Students Enrolled: 3

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Update grade for student1
        student1.updateGrade("A+");


    }
}
