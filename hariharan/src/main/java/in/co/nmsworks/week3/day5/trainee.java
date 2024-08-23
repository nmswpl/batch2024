package in.co.nmsworks.week3.day5;

public class trainee
{
    private int id;
    private String name;
    private String emailid;

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

    public String getEmailid() {
        return emailid;
    }

    public trainee(int id, String name, String emailid) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
