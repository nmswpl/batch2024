package in.co.nmsworks.week3.day5;

public class Trainee {
    private Integer id ;
    private String name ;
    private String emailId;

    public Trainee(Integer id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
