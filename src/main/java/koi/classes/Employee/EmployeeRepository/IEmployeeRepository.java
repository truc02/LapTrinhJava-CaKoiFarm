package koi.classes.Employee.EmployeeRepository;

import koi.classes.Employee.Employee;

public interface IEmployeeRepository {
    void save(Employee employee);
    Employee findById(int id);
    void update(Employee employee);
    void delete(Employee employee);
}