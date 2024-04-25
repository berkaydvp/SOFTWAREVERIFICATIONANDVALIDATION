// B211202371
// BERKAY ERDOĞAN
// SOFTWARE VERIFICATION AND VALIDATION
// ASSIGNMENT 1
// https://github.com/berkaydvp/SoftwareVV_HW1


package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class CalculatorTest {
    @ParameterizedTest
    @DisplayName("Division with different numbers")
    @CsvSource({
            "7, 4, 1.75f",
            "14, 10, 1.4f",
            "12, 3, 4",
            "8, 5, 1.6f",
            "10.5f, 5, 2.1f"
    })
    public void testDivision(float x, float y, float expected) {
        float realResult = Calculator.divide(x, y);
        Assertions.assertEquals(expected, realResult, 0.001);
    }

    @ParameterizedTest
    @DisplayName("Division by zero throws IllegalArgumentException")
    @CsvSource({
            "10, 0"
    })
    public void testDivideByZero(float a, float b) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.divide(a, b));
    }
}