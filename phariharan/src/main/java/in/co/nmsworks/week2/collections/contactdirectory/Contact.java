package in.co.nmsworks.week2.collections.contactdirectory;

import java.util.Locale;
import java.util.Objects;

public class Contact {
    private Integer contactNumber ;
    private  String name ;

    public Contact(Integer contactNumber, String name) {
        this.contactNumber = contactNumber;
        name = name.trim();
        this.name = name;
    }


    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
