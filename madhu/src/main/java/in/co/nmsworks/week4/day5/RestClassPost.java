package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestClassPost {
    private static void samplePOSTMethod() {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpPost postRequest = new HttpPost("https://jsonplaceholder.typicode.com/posts");
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset","UTF-8");
            postRequest.setHeader("Accept", "application/json");
            //Gson gson = new Gson();
            Post post1 = new Post(1,"this is a sample","this is a body");
            String jsonString = new Gson().toJson(post1);
            postRequest.setEntity(new StringEntity(jsonString));
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                // Extract and print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body: " + responseBody);
                System.out.println(post1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        RestClassPost rest = new RestClassPost();
        rest.samplePOSTMethod();
    }
}
