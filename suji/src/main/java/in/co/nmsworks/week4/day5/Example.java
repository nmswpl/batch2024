package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Example
{
    List<ResponseBody> listOResponseBody=new ArrayList<>();
    private void sampleGETMethod(String url)
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
              //  System.out.println("Response Body: " + responseBody);

                Gson gson= new Gson();
                ResponseBody[] responseBodies=gson.fromJson(responseBody,ResponseBody[].class);

                for (ResponseBody body : responseBodies)
                {
                    System.out.println(responseBodies);
               }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 public void setData() throws IOException {
     try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
         HttpPost postRequest = new HttpPost("https://jsonplaceholder.typicode.com/posts");
         postRequest.setHeader("Content-Type", "application/json");
         postRequest.setHeader("charset", "UTF-8");
         postRequest.setHeader("Accept", "application/json");

         ResponseBody obj;
         String jsonString = new Gson().toJson(new ResponseBody(1, "Perfume", "I love perfumes with floral & fruity flavour .."));
         postRequest.setEntity(new StringEntity(jsonString));

         try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
             String responseBody = EntityUtils.toString(response.getEntity());
             System.out.println("Response Body: " + responseBody);

         }
     }
 }

    public static void main(String[] args) throws IOException {
        Example obj=new Example();


obj.setData();
      //  obj.sampleGETMethod("https://jsonplaceholder.typicode.com/posts");
    }
}
