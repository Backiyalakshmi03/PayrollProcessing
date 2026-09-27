package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    private Manager manager;

    @BeforeEach
    void setUp() {

        manager = new Manager("E003", "Bakiya", 5000, 800, 300, 1000);
    }

    @Test
    void testGrossSalary() {

        assertEquals(7100, manager.calculateGrossSalary());
    }

    @Test
    void testDeduction() {

        assertEquals(852, manager.calculateDeduction());
    }

    @Test
    void testNetSalary() {

        assertEquals(6248, manager.calculateNetSalary());
    }
}