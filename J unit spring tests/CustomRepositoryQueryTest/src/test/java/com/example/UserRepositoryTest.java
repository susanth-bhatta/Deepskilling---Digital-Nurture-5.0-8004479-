package com.example;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void testFindByName() {

        // Save test data
        repository.save(new User(1L, "John"));
        repository.save(new User(2L, "Alice"));
        repository.save(new User(3L, "John"));

        // Execute custom query
        List<User> users = repository.findByName("John");

        // Verify results
        assertEquals(2, users.size());
        assertEquals("John", users.get(0).getName());
        assertEquals("John", users.get(1).getName());
    }
}