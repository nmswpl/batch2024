package in.co.nmsworks.week3.Day5;

import java.sql.Connection;

public class Trainee {
    private  int id;
    private String name;
    private String emailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Trainee(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
    public Trainee(){

    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
