package in.co.nmsworks.week2.collection;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ContactDetail {
    private static String name;
    private Integer contactNumber;
    public ContactDetail() {
    }

    public ContactDetail(String name, Integer contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public static String getName() {
        return name;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "ContactDetail{" +
                "name='" + name + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }

}
