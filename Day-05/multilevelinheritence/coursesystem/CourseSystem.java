package multilevelinheritence.coursesystem;


//main class
public class CourseSystem {
    public static void main(String[] args) {
        //object of course
        Course course = new Course("Java", 30);
        //object of online course
        OnlineCourse onlineCourse = new OnlineCourse("Python", 40, "Udemy", true);
        //object of paidonlinecourse
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("C++", 50, "Udacity", false, 20000, 20);

        course.displayInfo();
        onlineCourse.displayInfo();
        paidOnlineCourse.displayInfo();
    }
}