package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PayrollServiceTest {

    @ParameterizedTest
    @CsvSource({"3000, 500, 200, 3700", "4000, 600, 300, 4900", "5000, 800, 300, 6100"})
    void testPermanentGrossSalary(double basicSalary, double houseAllowance, double transportAllowance, double expectedGross) {

        PermanentEmployee employee = new PermanentEmployee("E001", "Test", basicSalary, houseAllowance, transportAllowance);

        assertEquals(expectedGross, employee.calculateGrossSalary());
    }
}