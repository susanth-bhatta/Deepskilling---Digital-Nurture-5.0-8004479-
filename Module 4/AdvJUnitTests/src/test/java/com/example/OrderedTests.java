package com.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("Executing Test 1");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("Executing Test 2");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("Executing Test 3");
    }
}