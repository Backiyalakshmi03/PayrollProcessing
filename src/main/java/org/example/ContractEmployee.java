package org.example;
public class ContractEmployee extends Employee {

    private double contractBonus;

    public ContractEmployee(String employeeId, String employeeName, double basicSalary, double contractBonus) {

        super(employeeId, employeeName, basicSalary);

        this.contractBonus = contractBonus;
    }

    @Override
    public String getEmployeeType() {

        return "Contract Employee";
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary() + contractBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.05;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeduction();
    }
}