package in.co.nmsworks.week2.sample;

import java.util.Objects;

public class Contact {

    private  String name;

    private  Integer phone;


    public Contact(String name, Integer phone) {

        this.name = name;
        this.phone = phone;
    }





    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
