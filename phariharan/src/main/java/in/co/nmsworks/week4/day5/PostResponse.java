package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PostResponse {
    private static void sampleGETMethod(String url,int userid,String title,String body) {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost(url);
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset", "UTF-8");
            postRequest.setHeader("Accept", "application/json");
            String jsonString = new Gson().toJson(new UserPost(userid,title,body));
            System.out.println(jsonString);
            postRequest.setEntity(new StringEntity(jsonString));
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
               /* // Extract the response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);*/
                // Extract and print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
//                System.out.println("Response Body: " + responseBody);

                System.out.println(responseBody);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        sampleGETMethod("https://jsonplaceholder.typicode.com/posts",2,"Game of thrones","Story about Dragons and 7 kingdoms");
    }
}
