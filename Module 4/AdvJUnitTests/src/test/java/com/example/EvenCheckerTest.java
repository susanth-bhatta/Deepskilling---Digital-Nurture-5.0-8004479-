package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    private final EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEven(int number) {

        // Arrange
        // number is provided automatically by @ValueSource

        // Act
        boolean result = checker.isEven(number);

        // Assert
        assertTrue(result);
    }
}