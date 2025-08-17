package homework9.two;

public class Course {
    private final String courseName;
    private final int capacity;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
