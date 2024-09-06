package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class RestCallExample {
    private static void sampleGETMethod() {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts/");
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
               // Extract the response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);
                // Extract and print the response body

                String responseBody = EntityUtils.toString(response.getEntity());

                Gson gson = new Gson();
                //System.out.println("Response Body: " + responseBody);

                PostDetail[] postDetails = gson.fromJson(responseBody, PostDetail[].class);
                for (int i = 0; i < postDetails.length; i++) {
                    postDetails[i].displayDetail();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void samplePostMethod() {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request

            HttpPost postRequest = new HttpPost("https://jsonplaceholder.typicode.com/posts");
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset", "UTF-8");
            postRequest.setHeader("Accept", "application/json");

            Gson gson = new Gson();
            String jsonString = gson.toJson(new PostDetail(1, "title example", "content"));
            postRequest.setEntity(new StringEntity(jsonString));
            System.out.println("json String : " + jsonString);
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {

                String responseBody = EntityUtils.toString(response.getEntity());
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);
                System.out.println("response body : " + responseBody);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        // RestCallExample.sampleGETMethod();
        RestCallExample.samplePostMethod();

    }
}
