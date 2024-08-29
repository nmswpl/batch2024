package in.co.nmsworks.week3.day5;

public class Trainees
{
    private String name;
    private int id;
    private String[]s;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString() {
        return "sample{" +

                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Trainees(String id, String name, String email)
    {
        setId(Integer.parseInt(String.valueOf(id)));
        setName(name);
        setEmail(email);
    }

}
