package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    MathOperations math = new MathOperations();

    @Test
    public void testAdd() {
        assertEquals(8, math.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, math.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, math.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(6, 3));
    }
}