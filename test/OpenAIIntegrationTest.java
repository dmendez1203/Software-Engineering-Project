/*
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import ai.OpenAIIntegration;

class OpenAIIntegrationTest {

    @Test
    void testGetAIResponse() throws Exception {
        // Mock HttpURLConnection
        HttpURLConnection mockConnection = mock(HttpURLConnection.class);

        // Mock the response
        String mockResponse = "{ \"id\": \"test\", \"choices\": [{ \"text\": \"Hello, world!\" }] }";
        when(mockConnection.getInputStream()).thenReturn(new ByteArrayInputStream(mockResponse.getBytes()));
        when(mockConnection.getOutputStream()).thenReturn(mock(OutputStream.class));

        // Set expected method calls on mock
        when(mockConnection.getRequestMethod()).thenReturn("POST");

        // Create an instance of OpenAIIntegration with the mock connection
        OpenAIIntegration openAIIntegration = new OpenAIIntegration("test_api_key", mockConnection);

        // Call the method and verify the result
        String result = openAIIntegration.getAIResponse("Hello", "text-davinci-003", 10);
        assertEquals("Hello, world!", result);

        // Verify interactions with the mock
        verify(mockConnection).setRequestMethod("POST");
        verify(mockConnection).getOutputStream();
        verify(mockConnection).getInputStream();
    }
}
*/