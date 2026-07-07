package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        // Step 1: Create a mock repository
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub the repository method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Create service using mock repository
        Service service = new Service(mockRepository);

        // Call the service method
        String result = service.processData();

        // Verify the result
        assertEquals("Processed Mock Data", result);

        // Verify repository interaction
        verify(mockRepository).getData();
    }
}