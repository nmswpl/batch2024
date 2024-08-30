package in.co.nmsworks.week4.day5;

import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ResponseBody
{
    private int userID;
    private int id;
    private String title;

    public ResponseBody() {
    }

    public ResponseBody(int userID, String title, String body) {
        this.userID = userID;
     //   this.id = id;
        this.title = title;
        this.body = body;
    }

    private String body;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ResponseBody[" +
                "userID=" + userID +
              //  ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ']';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
