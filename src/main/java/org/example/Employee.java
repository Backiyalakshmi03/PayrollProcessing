package org.example;

public abstract class Employee {

    private String employeeId;
    private String employeeName;
    private double basicSalary;

    public Employee(String employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract String getEmployeeType();

    public abstract double calculateGrossSalary();

    public abstract double calculateDeduction();

    public abstract double calculateNetSalary();

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Type: " + getEmployeeType());
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Deduction: " + calculateDeduction());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}