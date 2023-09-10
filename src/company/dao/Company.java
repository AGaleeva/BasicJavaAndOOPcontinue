package company.dao;

import company.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    int quantity();

    double totalSalary();

    default double avgSalary() {
        return totalSalary() / quantity();
    }

    double totalSales();

    void printEmployees();
    Employee[] findEmployeesHoursGreeterThan(int hours);
    Employee[] findEnployeesSalaryRange(int minSalary, int maxSalary);
}
