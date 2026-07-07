package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        // Step 1: Create a mock network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Step 2: Stub the network client method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Step 3: Create the service
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // Call the service method
        String result = networkService.connectToServer();

        // Verify the result
        assertEquals("Connected to Mock Connection", result);

        // Verify interaction
        verify(mockNetworkClient).connect();
    }
}