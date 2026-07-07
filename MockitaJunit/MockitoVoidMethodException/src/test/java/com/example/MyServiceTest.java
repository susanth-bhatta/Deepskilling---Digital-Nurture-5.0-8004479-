package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the void method to throw an exception
        doThrow(new RuntimeException("Deletion Failed"))
                .when(mockApi)
                .deleteData();

        // Step 3: Create service
        MyService service = new MyService(mockApi);

        // Verify exception is thrown
        assertThrows(RuntimeException.class, () -> {
            service.removeData();
        });

        // Verify interaction
        verify(mockApi).deleteData();
    }
}