package homework9.task2;

public class Enrollments {

    private Enrollment[] enrollments = new Enrollment[50];

    public class Enrollment {
        private final Student student;
        private final Course course;

        public Enrollment(Student student, Course course) {
            this.student = student;
            this.course = course;
        }
    }


    public void enroll(Course course, Student student) {
        Enrollment enrollment = new Enrollment(student, course);
        if (checkIfEnrolled(enrollment)){
            System.out.println("Student with id:" + student + "is already enrolled in course:" + course);
        } else {
            for(int i = 0; i < enrollments.length; ++i){
                if(enrollments[i]==null){
                    enrollments[i] = enrollment;
                    break;
                }else if(i==enrollments.length-1){
                    System.out.println("This student cannot enroll in more courses.");
                }
            }
        }
    }

    private boolean checkIfEnrolled(Enrollment enrollmentToCheck) {
        boolean isEnrolled = false;
        for (Enrollment enrollment: enrollments){
            if (enrollment == null){
                break;
            }
            else {
                if (enrollment.equals(enrollmentToCheck)){
                    isEnrolled = true;
                }
            }
        }
        return isEnrolled;
    }

    public void printEnrollments() {
        for (Enrollment enrollment: enrollments) {
            if (enrollment == null) {
                break;
            }
            System.out.println(enrollment.student + " is enrolled in " + enrollment.course);
        }
    }

}
