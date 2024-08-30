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

import java.util.List;
import java.util.Stack;

public class RestClientPost {
    public static void writeIntoClient(){
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost("https://jsonplaceholder.typicode.com/posts");
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("charset", "UTF-8");
            postRequest.setHeader("Accept", "application/json");

            Gson gson=new Gson();
            String jsonString=gson.toJson(new SamplePostUser(11,"thirukural written by thiruvalluvar","thirukural"));

            postRequest.setEntity(new StringEntity(jsonString));
           // HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts");
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println(responseBody);
                SamplePostUser postUser=gson.fromJson(responseBody,SamplePostUser.class);
                System.out.println("Json to object :: ");
                System.out.println((postUser));
//                System.out.println("object to Json :: ");
//                System.out.println(gson.toJson(postUserList));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main( String[] args ){
        RestClientPost.writeIntoClient();
    }
}
