package in.co.nmsworks.week3.day5;

public class Trainees {
    private int id;
    private String name;
    private String emailid;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmailid(){
        return emailid;
    }

    public void setEmailid(String emailid){
        this.emailid = emailid;
    }

    @Override
    public String toString(){
        return "Trainees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                '}'+'\n';
    }
}
