package in.co.nmsworks.week4.day5;

public class Posts {

    private int userId;
    private int id;
    private String title;
    private String body;


    public int getUserID() {
        return userId;
    }

    public void setUserID(int userID) {
        userId = userID;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "ResponseBody{" +
                "UserID=" + userId+
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
