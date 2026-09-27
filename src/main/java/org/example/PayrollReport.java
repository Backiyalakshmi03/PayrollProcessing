package org.example;

import java.util.List;

public class PayrollReport {

    public void displayEmployeeReport(Employee employee) {

        System.out.println("========== PAYROLL REPORT ==========");

        System.out.println("Employee ID: " + employee.getEmployeeId());

        System.out.println("Employee Name: " + employee.getEmployeeName());

        System.out.println("Employee Type: " + employee.getEmployeeType());

        System.out.println("Gross Salary: " + employee.calculateGrossSalary());

        System.out.println("Deduction: " + employee.calculateDeduction());

        System.out.println("Net Salary: " + employee.calculateNetSalary());

        System.out.println("====================================");
        System.out.println();
    }

    public void displayAllEmployees(List<Employee> employees) {

        for (Employee employee : employees) {
            displayEmployeeReport(employee);
        }
    }
}