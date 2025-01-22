import java.util.ArrayList;

class School{
    public String schoolName;
    public ArrayList<Student>students;
    School(String schoolName){
        this.schoolName=schoolName;
        this.students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);

    }

}

class Student{
    public String studentName;
    public ArrayList<Course>studentCourse;
    Student(String studentName){
        this.studentName=studentName;
        this.studentCourse=new ArrayList<>();
    }

    public void addCourse(Course course){
        studentCourse.add(course);
        course.addStudent(this);

    }

    public void showCourses(){
        for(Course a:studentCourse){
            System.out.println("student "+this.studentName+"enrolled in "+a.courseName);
        }
    }

}

class Course{
    public String courseName;
    public ArrayList<Student>courseStudent;
    Course(String courseName){
        this.courseName=courseName;
        this.courseStudent=new ArrayList<>();
    }

    public void addStudent(Student student){
        this.courseStudent.add(student);
    }
    public void showStudents(){
    for(Student a:courseStudent){
        System.out.println("student "+a.studentName+" is enrolled in "+this.courseName);
    }
    }

}




public class StudentSystem {
    public static void main(String[] args) {
        School school1=new School("TIT");
        School school2=new School("LNCT");

        Student student1=new Student("anubhav");
        Student student2=new Student("deepansh");
        Student student3=new Student("furquan");
        Student student4=new Student("om");

        Course course1=new Course("java");
        Course course2=new Course("python");
        Course course3=new Course("c++");
        Course course4=new Course("c");

        school1.addStudent(student1);
        school1.addStudent(student2);
        school2.addStudent(student3);
        school2.addStudent(student4);

        student1.addCourse(course1);
        student2.addCourse(course2);
        student3.addCourse(course3);
        student4.addCourse(course4);

        student1.showCourses();
        student2.showCourses();
        student3.showCourses();
        student4.showCourses();

        course1.showStudents();
        course2.showStudents();
        course3.showStudents();
        course4.showStudents();
    }
}
