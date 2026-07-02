package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        MathOperationsTest.class,
        AssertionsTest.class
})
public class AllTests {
}