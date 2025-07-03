public class Employee {

    String id;
    int departmentNumber;
    int age;
    String gender;

    public Employee(String id, int departmentNumber, int age, String gender) {

        this.id = id;
        this.departmentNumber = departmentNumber;
        this.age = age;
        this.gender = gender;

    }

    void printEmployee() {
        System.out.println("ID: " + id + ", Department Number: " + departmentNumber
                + ", Age: " + age + ", Gender: " + gender);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("jack12", 1, 27, "Male");
        Employee emp2 = new Employee("tik07", 1, 27, "Male");
        Employee emp3 = new Employee("ana00", 2, 25, "Female");

        emp1.printEmployee();
        emp2.printEmployee();
        emp3.printEmployee();

    }

}