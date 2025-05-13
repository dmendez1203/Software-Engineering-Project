
package ai;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class OpenAIIntegration {
    private final String apiKey;
    private HttpURLConnection connection;

    public OpenAIIntegration(String apiKey) {
        this.apiKey = apiKey;
        
    }

    // Constructor for testing with a mock connection
    public OpenAIIntegration(String apiKey, HttpURLConnection connection) {
        this.apiKey = apiKey;
        this.connection = connection;
    }

    public String getAIResponse(String prompt, String model, int maxTokens) throws Exception {
        String endpoint = "https://api.openai.com/v1/completions";
        String requestData = String.format(
            "{ \"model\": \"%s\", \"prompt\": \"%s\", \"max_tokens\": %d }",
            model, prompt, maxTokens
        );
        byte[] postData = requestData.getBytes(StandardCharsets.UTF_8);

        URL url = new URL(endpoint);
        HttpURLConnection conn = (connection != null) ? connection : (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + apiKey);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(postData);
        }

        try (InputStream is = conn.getInputStream()) {
            byte[] response = is.readAllBytes();
            return new String(response, StandardCharsets.UTF_8);
        }
    }
}
