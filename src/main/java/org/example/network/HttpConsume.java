package org.example.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpConsume {

    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://ntfy.sh/YOUR_TOPIC/raw"))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofInputStream())
                .thenApply(HttpResponse::body)
                .thenAccept(inputStream -> {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    reader.lines().forEach(line -> {
                        // process each line here
                        //Replace with updating model with incoming text message. Do this in Platform.runLater()
                        System.out.println(Thread.currentThread().getName());
                        System.out.println(line);
                    });
                });

        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
