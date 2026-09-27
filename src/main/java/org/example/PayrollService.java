package org.example;

import java.util.List;

public class PayrollService {

    public void processPayroll(Employee employee) {

        System.out.println("Processing payroll for: " + employee.getEmployeeName());

        System.out.println("Employee Type: " + employee.getEmployeeType());

        System.out.println("Gross Salary: " + employee.calculateGrossSalary());

        System.out.println("Deduction: " + employee.calculateDeduction());

        System.out.println("Net Salary: " + employee.calculateNetSalary());

        System.out.println();
    }

    public void processAllEmployees(List<Employee> employees) {

        for (Employee employee : employees) {
            processPayroll(employee);
        }
    }
}