package in.co.nmsworks.week2.collection;

public class Contacts {
    private String name;
    private Integer mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Contacts(String name, Integer mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}




