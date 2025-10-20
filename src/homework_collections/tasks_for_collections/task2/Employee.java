package homework_collections.tasks_for_collections.task2;

import java.util.Objects;

class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return  id == employee.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return String.format("#%d %s %.0f", id, name, salary);
    }
}