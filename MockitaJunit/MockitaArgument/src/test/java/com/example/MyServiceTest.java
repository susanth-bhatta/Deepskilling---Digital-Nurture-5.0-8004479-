package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testArgumentMatching() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create the service
        MyService service = new MyService(mockApi);

        // Step 3: Call the method with a specific argument
        service.processData("Hello Mockito");

        // Step 4: Verify using an argument matcher
        verify(mockApi).sendData(eq("Hello Mockito"));
    }
}