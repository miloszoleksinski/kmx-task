package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    private HttpClient() {}

    public static String callAPI(final String apiUrl) {
        try {
            return call(getConnection(apiUrl));
        } catch (Exception e) {
            System.out.printf("Exception thrown while trying to call API: %s. Exception: %s", apiUrl, e);
        }
        return null;
    }

    private static HttpURLConnection getConnection(final String apiUrl) throws IOException {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            return connection;
        } catch (IOException e) {
            System.out.printf("Exception thrown while trying to open connection to URL: %s. Exception: %s", apiUrl, e);
            throw e;
        }
    }

    private static String call(final HttpURLConnection connection) throws IOException {
        StringBuilder response = new StringBuilder();
        try(BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        return response.toString();
    }

}
