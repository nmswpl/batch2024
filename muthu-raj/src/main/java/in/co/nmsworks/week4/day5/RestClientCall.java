package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class RestClientCall {

    private static void sampleGETMethod()
    {
        // Create a HttpClient instance
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create a GET request
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts/");
            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
               /* // Extract the response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);*/
                // Extract and print the response body
                String responseBody = EntityUtils.toString(response.getEntity());
//                System.out.println("Response Body: " + responseBody);


                Gson gson = new Gson();

//                ResponseBody[] rb = gson.fromJson(responseBody, ResponseBody[].class);

                List<Posts> rbList = gson.fromJson(responseBody, new TypeToken<List<Posts>>(){}.getType());

                for (Posts body : rbList) {
                    System.out.println(body);
                    System.out.println("------------------------");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void samplePOSTMethod()
    {
        String uri = "https://jsonplaceholder.typicode.com/posts/";
        try (CloseableHttpClient httpPost = HttpClients.createDefault())
        {
            HttpPost postRequest = new HttpPost(uri);
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset", "UTF-8");
            postRequest.setHeader("Accept", "application/json");

            Gson gson = new Gson();
            Posts p = new Posts();

            p.setBody("blah blah blah");
            p.setTitle("FooBoo");
            p.setUserID(1);

            String jsonString = gson.toJson(p);
            postRequest.setEntity(new StringEntity(jsonString));

            try (CloseableHttpResponse response = httpPost.execute(postRequest)) {
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status code :: " + statusCode);
                System.out.println("Response Body ::\n" + EntityUtils.toString(response.getEntity()));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
            samplePOSTMethod();
//        sampleGETMethod();

    }
}
