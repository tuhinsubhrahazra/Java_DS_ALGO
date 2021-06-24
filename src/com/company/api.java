package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class api {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://google-search3.p.rapidapi.com/api/v1/scholar/q=high+frequency+trading"))
                .header("x-rapidapi-key", "a75f82de77msh64964dfe89b8f77p13950djsn7f0abd8b456c")
                .header("x-rapidapi-host", "google-search3.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
