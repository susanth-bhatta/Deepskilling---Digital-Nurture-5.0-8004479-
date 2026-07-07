package com.example;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository repository;

    @Test
    void testFullFlow() {

        User user = new User(1L, "John");
        repository.save(user);

        User result = restTemplate.getForObject(
                "http://localhost:" + port + "/users/1",
                User.class);

        assertEquals("John", result.getName());
    }
}