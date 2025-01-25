package multilevelinheritence.coursesystem;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    //constructor to initialize the variables
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    //overridden method
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform " + platform);
        System.out.println("Recorded " + isRecorded);
    }
}