package in.co.nmsworks.week5.day4;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class UserJsonParsing {
    private static String sampleGETMethod(String url) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                return responseBody;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        User[] userList = new Gson().fromJson(sampleGETMethod("https://jsonplaceholder.typicode.com/users"), User[].class);

        for (User user : userList) {
            //System.out.println("id : "+user.getId()+"\nname: "+user.getName()+"\nuserName : "+user.getUsername()+"\nemail:"+user.getEmail()+"\naddress ::\n\tStreet :"+user.getAddress().getStreet()+"\n\tsuite:"+user.getAddress().getSuite()+"\n\tcity : "+user.getAddress().getCity()+"\n\tzipcode:"+user.getAddress().getZipcode()+"\n\tgeo:\n\t\tlat:"+user.getAddress().getGeo().getLat()+"\n\t\tlng:"+user.getAddress().getGeo().getLng()+"\nPhone:"+user.getPhone()+"\nWebsite"+user.getWebsite()+"\nCompany:\n\tname:"+user.getCompany().getName()+"\n\tcatchPhrase:"+user.getCompany().getCatchPhrase()+"\n\tbs:"+user.getCompany().getBs());
            System.out.println(user);
            System.out.println("--------------------><------------------");

        }

    }
}
