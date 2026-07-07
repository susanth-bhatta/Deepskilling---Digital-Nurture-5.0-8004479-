package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethod() {

        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the void method
        doNothing().when(mockApi).saveData();

        // Step 3: Create service
        MyService service = new MyService(mockApi);

        // Call the method
        service.performAction();

        // Verify interaction
        verify(mockApi).saveData();
    }
}