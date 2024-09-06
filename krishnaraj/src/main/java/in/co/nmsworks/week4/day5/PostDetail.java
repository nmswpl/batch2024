package in.co.nmsworks.week4.day5;

public class PostDetail {
    private int userId;
    private int id;
    private String title;
    private String body;

    public PostDetail() {
    }

    public PostDetail(int userId, String title, String body) {
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    public void displayDetail(){
        System.out.println("UserId : " + getUserId());
        System.out.println("id : " + getId());
        System.out.println("Tiltle : " + getTitle());
        System.out.println("Body : " + getBody());
        System.out.println("*********       *****************       ***********");
    }
}
