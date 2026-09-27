package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp() {

        employee = new PermanentEmployee("E001", "Bakiya lakshmi", 3000, 500, 200);
    }

    @Test
    void testGrossSalary() {

        assertEquals(3700, employee.calculateGrossSalary());
    }

    @Test
    void testDeduction() {

        assertEquals(370, employee.calculateDeduction());
    }

    @Test
    void testNetSalary() {

        assertEquals(3330, employee.calculateNetSalary());
    }
}