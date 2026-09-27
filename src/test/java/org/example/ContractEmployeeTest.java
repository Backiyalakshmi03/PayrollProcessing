package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {

        employee = new ContractEmployee("E002", "Yoga", 3000, 400);
    }

    @Test
    void testGrossSalary() {

        assertEquals(3400, employee.calculateGrossSalary());
    }

    @Test
    void testDeduction() {

        assertEquals(170, employee.calculateDeduction());
    }

    @Test
    void testNetSalary() {

        assertEquals(3230, employee.calculateNetSalary());
    }
}