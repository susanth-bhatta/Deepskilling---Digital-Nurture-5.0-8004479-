package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        // Step 1: Create mock FileReader and FileWriter
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Step 2: Stub FileReader method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Step 3: Create service
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Call the service method
        String result = fileService.processFile();

        // Verify result
        assertEquals("Processed Mock File Content", result);

        // Verify interactions
        verify(mockFileReader).read();
        verify(mockFileWriter).write("Mock File Content");
    }
}