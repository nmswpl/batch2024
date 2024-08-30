package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RestCLientCall {
    private static void sampleGETMethod()
    {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts");
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                // Extract the response status code
                //int statusCode = response.getStatusLine().getStatusCode();
                //System.out.println("Status Code: " + statusCode);
                // Extract and print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
               // System.out.println("Response Body: " + responseBody);

                Gson gson=new Gson();
                PostUser[] postUserList=gson.fromJson(responseBody,PostUser[].class);
                //List<PostUser> postUserList=gson.fromJson(responseBody, new TypeToken<List<PostUser>>(){}.getType());
                System.out.println("Json to object :: ");
                System.out.println((postUserList));
//                System.out.println("object to Json :: ");
//                System.out.println(gson.toJson(postUserList));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main( String[] args ){
        RestCLientCall.sampleGETMethod();
    }
}
