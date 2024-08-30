package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class RestCallExample {
    private static String  sampleGETMethod(String url)
    {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpGet request = new HttpGet(url);
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
               /* // Extract the response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);*/
                // Extract and print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
//                System.out.println("Response Body: " + responseBody);
                return responseBody;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        UserPost userPost = new Gson().fromJson(sampleGETMethod("https://jsonplaceholder.typicode.com/posts/1"), UserPost.class);
        System.out.println("\nFrom Class");

        System.out.println("Posts User ID : "+userPost.getUserId());
        System.out.println("Posts Id :"+userPost.getId());
        System.out.println("Posts Title : "+userPost.getTitle());
        System.out.println("Posts Body : "+userPost.getBody());

        List<UserPost> userPostList = new Gson().fromJson(sampleGETMethod("https://jsonplaceholder.typicode.com/posts"), new TypeToken<List<UserPost>>(){}.getType());
        for (UserPost post : userPostList) {
            System.out.println("Posts User ID : "+post.getUserId());
            System.out.println("Posts Id :"+post.getId());
            System.out.println("Posts Title : "+post.getTitle());
            System.out.println("Posts Body : "+post.getBody());
            System.out.println("\n");
        }
    }
}
