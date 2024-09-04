package in.co.nmsworks.week5.day3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class JsonRequest {
    public static void main(String[] args) throws IOException {
        JsonRequest jsonRequest = new JsonRequest();
        jsonRequest.getData();

    }

    public void getData() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/users");

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Status Code: " + statusCode);
                String responseBody = EntityUtils.toString(response.getEntity());

                Gson gson = new Gson();

                List<User> usertList = gson.fromJson(responseBody, new TypeToken<List<User>>(){}.getType());

                for (User user : usertList) {
                    System.out.println(user);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
