package homework_collections.tasks_for_collections.task2;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeManager {
    private final Map<Integer,Employee> employees = new HashMap<>();

    public void getOrUpdate(Employee employee) {
        if (employee == null) return;
        employees.put(employee.id, employee);
    }

    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    public Employee deleteEmployeeById(Integer id) {
        return employees.remove(id);
    }

    public List<Employee> viewBySalary() {
        return employees.values().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    }

    public List<Employee> viewByNameOrId() {
        return employees.values().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }
}
