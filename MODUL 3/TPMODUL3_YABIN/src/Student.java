import java.util.ArrayList;

class Student extends User {
    protected ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(String name, int id) {
        super(name, id);
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + "\nEnrolled Courses: " + enrolledCourses;
    }
}
