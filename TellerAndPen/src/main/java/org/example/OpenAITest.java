package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OpenAITest {
    public static void main(String[] args) throws Exception {
        // Replace this with your actual API key
        String apiKey = System.getenv("OPENAI_API_KEY");

        String json = """
        {
          "model": "gpt-3.5-turbo",
          "messages": [{"role": "user", "content": "Hello!"}]
        }
        """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openai.com/v1/chat/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response code: " + response.statusCode());
        System.out.println("Response body:\n" + response.body());
    }
}