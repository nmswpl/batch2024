package in.co.nmsworks.week4.day5;

public class SamplePostUser {
    private int UserId;
    private int id;
    private String body;
    private String title;

    public SamplePostUser(){
    }

    public SamplePostUser( int userId, String body, String title ){
        UserId = userId;
        this.body = body;
        this.title = title;
    }

    public int getId(){
        return id;
    }

    public int getUserId(){
        return UserId;
    }

    public void setUserId( int userId ){
        UserId = userId;
    }

    public String getBody(){
        return body;
    }

    public void setBody( String body ){
        this.body = body;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle( String title ){
        this.title = title;
    }

    @Override
    public String toString(){
        return "SamplePostUser{" +
                "UserId=" + UserId +
                ", id=" + id +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
