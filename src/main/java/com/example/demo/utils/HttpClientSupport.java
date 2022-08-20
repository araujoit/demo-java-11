package com.example.demo.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientSupport {

	public static void validate() throws IOException, InterruptedException {
		int port = 443;
		HttpClient httpClient = HttpClient.newBuilder()
		  .version(HttpClient.Version.HTTP_2)
		  .connectTimeout(Duration.ofSeconds(20))
		  .build();
		HttpRequest httpRequest = HttpRequest.newBuilder()
		  .GET()
		  .uri(URI.create("https://www.google.com.br:" + port))
		  .build();
		HttpResponse<?> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println("Body: " + httpResponse.body());
	}
}
