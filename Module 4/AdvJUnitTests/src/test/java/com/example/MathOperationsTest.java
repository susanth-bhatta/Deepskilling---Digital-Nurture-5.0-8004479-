package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    private final MathOperations math = new MathOperations();

    @Test
    void testAdd() {
        assertEquals(8, math.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, math.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, math.multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, math.divide(6, 3));
    }
}