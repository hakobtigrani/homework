package homework9.task2;

public class Run {

    public static void main(String[] args) {

        Student student1 = new Student("Jack", "id1");
        Student student2 = new Student("Pum", "id2");
        Student student3 = new Student("Andy", "id3");
        Student student4 = new Student("Dave", "id4");
        Student student5 = new Student("Brock", "id5");
        Student student6 = new Student("Frost", "id6");

        Course course1 = new Course("Course1", 3);
        Course course2 = new Course("Course2", 3);

        Enrollments enrollments = new Enrollments();
        enrollments.enroll(course1, student1);
        enrollments.enroll(course2, student2);
        enrollments.enroll(course1, student3);
        enrollments.enroll(course2, student4);
        enrollments.enroll(course1, student5);
        enrollments.enroll(course2, student6);

        enrollments.printEnrollments();

    }



}
