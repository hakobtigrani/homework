package homework_collections.tasks_for_collections.task2;

import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.getOrUpdate(new Employee(9, "Chen", 120000));
        manager.getOrUpdate(new Employee(17, "Ana", 72000));
        manager.getOrUpdate(new Employee(4, "Bo", 98000));

        Employee bo = manager.getEmployeeById(4);
        System.out.println("\nEmployee ID:" + bo.id);

        List<Employee> bySalary = manager.viewBySalary();
        System.out.println("Employees sorted by salary: " + bySalary);

        System.out.println("----------------------------");

        List<Employee> byNameOrId = manager.viewByNameOrId();
        System.out.println("Employees sorted by names: " + byNameOrId);

        System.out.println("----------------------------");

        manager.deleteEmployeeById(4);
        System.out.println("Deleted Employee :" + manager.getEmployeeById(4));


        System.out.println("Employees sorted by names: " + manager.viewByNameOrId());
    }
}
