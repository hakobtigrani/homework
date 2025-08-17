package homework9.task3;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this(name, 0);
    }

    public String getName() {return name;}
    public int getSalary() {return salary;}

}
