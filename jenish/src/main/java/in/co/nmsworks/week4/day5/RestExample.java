package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class RestExample {
    private void sampleGETMethod()
    {
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
                //System.out.println("Response Body: " + responseBody);

                Gson gson = new Gson();
                //Post[] jsonBody = gson.fromJson(responseBody, Post[].class);

                List<Post> postList = gson.fromJson(responseBody, new TypeToken<List<Post>>(){}.getType());

                for (Post post : postList) {
                    System.out.println(post);
                }

            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void samplePostMethod(){
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost("https://jsonplaceholder.typicode.com/posts/");
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset","UTF-8");
            postRequest.setHeader("Accept", "application/json");

            Gson gson = new Gson();
            Post post = new Post(1,"Fairy tale","It is a new Post");
            String jsonString = gson.toJson(post);
            //System.out.println(jsonString);
            postRequest.setEntity(new StringEntity(jsonString));

            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);

                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body: " + responseBody);

            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        RestExample restExample = new RestExample();
        //restExample.sampleGETMethod();
        restExample.samplePostMethod();
    }
}