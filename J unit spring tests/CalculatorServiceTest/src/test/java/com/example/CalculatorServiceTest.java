package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testAdd() {

        // Create service object
        CalculatorService calculatorService = new CalculatorService();

        // Call the method
        int result = calculatorService.add(10, 20);

        // Verify the result
        assertEquals(30, result);
    }
}