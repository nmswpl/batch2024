package in.co.nmsworks.week5.day4;

import com.google.gson.Gson;
import in.co.nmsworks.week4.day5.PostDetail;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class UserRunner {
    private static void getUserDeatails() {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/users");
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                // Extract the response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);
                // Extract and print the response body

                String responseBody = EntityUtils.toString(response.getEntity());

                Gson gson = new Gson();
                //System.out.println("Response Body: " + responseBody);

                User[] users = gson.fromJson(responseBody, User[].class);
                for (int i = 0; i < users.length; i++) {
                    users[i].displayDetails();
                    System.out.println("\n\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserRunner.getUserDeatails();
    }
}
