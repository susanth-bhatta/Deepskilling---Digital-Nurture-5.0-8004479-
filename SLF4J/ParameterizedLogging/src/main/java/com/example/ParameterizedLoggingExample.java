package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Sush";
        int age = 25;

        logger.info("User {} is {} years old.", username, age);

        double salary = 75000.50;

        logger.info("User {} has salary {}.", username, salary);

        String city = "Hyderabad";

        logger.info("User {} lives in {}.", username, city);

    }
}