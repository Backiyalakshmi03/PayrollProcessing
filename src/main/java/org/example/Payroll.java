package org.example;
public class Payroll {

    private Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public void processPayroll() {

        System.out.println("Processing Payroll...");
        System.out.println();

        employee.displayEmployeeDetails();
    }

    public void generatePayslip() {

        System.out.println();
        System.out.println("========== PAYSLIP ==========");

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Type: " + employee.getEmployeeType());

        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Gross Salary: " + employee.calculateGrossSalary());
        System.out.println("Deduction: " + employee.calculateDeduction());
        System.out.println("Net Salary: " + employee.calculateNetSalary());

        System.out.println("=============================");
    }
}