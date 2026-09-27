package org.example;

import java.util.ArrayList;
import java.util.List;

public class PayrollDemo {

    public static void main(String[] args) {

        Employee permanentEmployee = new PermanentEmployee("E001", "Bakiya Lakshmi", 3000, 500, 200);

        Employee contractEmployee = new ContractEmployee("E002", "Yoga", 3000, 400);

        Employee manager = new Manager("E003", "Bakiya", 5000, 800, 300, 1000);
        // Polymorphism
        System.out.println("========== POLYMORPHISM ==========");

        System.out.println("Permanent Gross: "
                + permanentEmployee.calculateGrossSalary());

        System.out.println("Contract Gross: "
                + contractEmployee.calculateGrossSalary());

        System.out.println("Manager Gross: "
                + manager.calculateGrossSalary());

        System.out.println();

        // List<Employee>
        List<Employee> employees = new ArrayList<>();

        employees.add(permanentEmployee);
        employees.add(contractEmployee);
        employees.add(manager);

        // PayrollService
        PayrollService payrollService = new PayrollService();

        payrollService.processAllEmployees(employees);

        // PayrollReport
        PayrollReport payrollReport = new PayrollReport();

        payrollReport.displayAllEmployees(employees);

        // Payroll HAS-A Employee
        Payroll payroll = new Payroll(permanentEmployee);

        payroll.processPayroll();
        payroll.generatePayslip();
    }
}