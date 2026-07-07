package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {

        // Step 1: Create a mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // Step 2: Stub the REST client method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Step 3: Create the service using the mock client
        ApiService apiService = new ApiService(mockRestClient);

        // Call the service method
        String result = apiService.fetchData();

        // Verify the result
        assertEquals("Fetched Mock Response", result);

        // Verify interaction
        verify(mockRestClient).getResponse();
    }
}