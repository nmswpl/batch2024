package in.co.nmsworks.week5.day4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class GetUserDetailsFromJson{
    public static void main( String[] args ){
        GetUserDetailsFromJson obj=new GetUserDetailsFromJson();
        List<UserDetails> userDetailsList=obj.RetriveUserDetails("https://jsonplaceholder.typicode.com/users");
        for (UserDetails userDetails : userDetailsList) {
            System.out.println(userDetails);
        }
    }

    public List<UserDetails> RetriveUserDetails(String path){
        List<UserDetails> userDetailsList = new ArrayList<>();

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(path);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                Gson gson = new Gson();
                userDetailsList = gson.fromJson(responseBody, new TypeToken<List<UserDetails>>() {}.getType());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userDetailsList;
    }
}
