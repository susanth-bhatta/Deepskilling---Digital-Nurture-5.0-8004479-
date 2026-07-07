package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService userService;

    @Test
    void testUserNotFound() {

        when(repository.findById(1L))
                .thenReturn(Optional.empty());

        UserNotFoundException exception =
                assertThrows(UserNotFoundException.class,
                        () -> userService.getUserById(1L));

        assertEquals("User not found", exception.getMessage());
    }
}